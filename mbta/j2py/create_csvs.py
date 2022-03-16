import codecs
import os
from pathlib import Path
from typing import Union, Any

import pandas as pd
from pandas import DataFrame
from tqdm import tqdm


def is_float(element: Any) -> bool:
    try:
        float(element)
        return True
    except:
        return False


def read_data_frame(csvs: Union[list, set]) -> DataFrame:
    data_frames = list()
    progress = tqdm(csvs)
    for csv in progress:
        # progress.set_description(csv)
        if os.path.isfile(csv) and os.path.getsize(csv) > 0:
            with codecs.open(csv, 'r', encoding="latin-1") as output_file:
                output_lines = output_file.readlines()
                if 'TIMEOUT' not in output_lines[0] and len(output_lines) == 10:
                    data_frame = pd.read_csv(csv, names=["class", "mutant", "result"], dtype=str,
                                             on_bad_lines='skip')
                    data_frames.append(data_frame)

    data_frame = pd.concat(data_frames)
    data_frame['test_index'] = data_frame.index
    return data_frame


def filter_data_frame(data_frame: DataFrame) -> DataFrame:
    print("Filtering out executions with less than 10 outputs and with Exceptions")
    data_frame = data_frame.groupby(["class", "mutant"]).filter(
        lambda row: len(row) == 10 and not row['result'].astype('str').str.contains("EXCEPTION", regex=False).any())
    return data_frame


def print_data_frame_to_csv(data_frame: DataFrame, language: str):
    if language is not None:
        if not os.path.exists("csvs"):
            os.makedirs("csvs", exist_ok=True)
        print(f"Writing {language} CSV")
        data_frame.to_csv(f"csvs/{language}.csv", index=False, na_rep="NA")
        print(f"Writing {language} Mutants CSV")
        data_frame[data_frame['mutant'] != "ORIGINAL"].to_csv(f"csvs/{language}_mutants.csv", index=False, na_rep="NA")
        print(f"Writing {language} Original CSV")
        data_frame[data_frame['mutant'] == "ORIGINAL"].to_csv(f"csvs/{language}_original.csv", index=False, na_rep="NA")


def get_mutant_dir(directory, line):
    return directory + '/mutants/' + line.replace("\n", "")


def get_output_dir(directory, line):
    return directory + '/output/' + str(Path(line.replace("\n", "")).parent.with_suffix(".csv")).replace("\\", "-")


if __name__ == "__main__":
    directory = '../../../TransCode/'
    with open(f'../../intersecting_classes.txt', 'r') as classes_file:
        classes = classes_file.readlines()
    with open(f'../../intersecting_java_mutants.txt', 'r') as mutants_file:
        mutants = mutants_file.readlines()

    print("Getting Java CSVs")
    java_csvs = [get_output_dir(directory, line) for line in mutants]
    java_csvs.extend([directory + "output/" + Path(line.replace("\n", "")).stem + "_original.csv" for line in classes])
    print("Reading Java CSVs")
    # java_data_frame = read_data_frame(java_csvs)
    java_data_frame = pd.read_csv("csvs/java.csv", low_memory=False, dtype=str)
    java_data_frame = filter_data_frame(java_data_frame)
    java_data_frame['result'] = pd.to_numeric(java_data_frame['result'], errors="ignore").apply(
        lambda x: round(float(x), 8) if is_float(x) else x)
    print_data_frame_to_csv(java_data_frame, "java")

    print("Getting Python CSVs")
    python_csvs = [get_output_dir(directory, line).replace(".csv", "_python.csv") for line in mutants]
    python_csvs.extend(
        [directory + "output/" + Path(line.replace("\n", "")).stem + "_original_python.csv" for line in classes])
    print("Reading Python CSVs")
    # python_data_frame = read_data_frame(python_csvs)
    python_data_frame = pd.read_csv("csvs/python.csv", low_memory=False, dtype=str)
    python_data_frame = filter_data_frame(python_data_frame)
    python_data_frame['result'] = pd.to_numeric(python_data_frame['result'], errors="ignore").apply(
        lambda x: round(float(x), 8) if is_float(x) else x)
    print_data_frame_to_csv(python_data_frame, "python")

    print("Merging DataFrames")
    merged = pd.merge(java_data_frame, python_data_frame, on=["class", "mutant", 'test_index'],
                      suffixes=('_java', '_python'), how='left')
    print("Mutating DataFrame. Adding 'equal_results'")
    merged['equal_results'] = merged['result_python'].astype(str).str.lower() == merged['result_java'].astype(str).str.lower()
    print("Reordering Columns")
    merged = merged[['class', 'mutant', 'test_index', 'result_java', 'result_python', 'equal_results']]
    print_data_frame_to_csv(merged, "merged")
