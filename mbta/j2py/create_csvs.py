import os
from typing import Union

import pandas as pd
from pandas import DataFrame
from progress.bar import Bar


def read_data_frame(csvs: Union[list, set]) -> DataFrame:
    data_frames = list()
    with Bar('Processing', max=len(csvs)) as bar:
        bar.check_tty = False
        for csv in csvs:
            bar.next()
            if os.path.exists(csv) and os.path.getsize(csv) > 0:
                with open(csv, 'r') as output_file:
                    output_line = output_file.readline()
                    if 'TIMEOUT' not in output_line:
                        data_frame = pd.read_csv(csv, names=["class", "mutant", "result"], dtype=str,
                                                 on_bad_lines='skip')
                        data_frames.append(data_frame)

    data_frame = pd.concat(data_frames)
    data_frame['index'] = data_frame.index
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


if __name__ == "__main__":
    directory = '../../TransCode'
    with open(f'{directory}/mutants.txt', 'r') as mutants_file:
        lines = mutants_file.readlines()

    print("Getting Java CSVs")
    java_csvs = [directory + '/output/' + line.replace('/', '-').replace('\n', '') + ".csv" for line in lines]
    # java_data_frame = pd.read_csv("csvs/java.csv", low_memory=False, dtype=str)
    print("Reading Java CSVs")
    java_data_frame = read_data_frame(java_csvs)
    java_data_frame = filter_data_frame(java_data_frame)
    print_data_frame_to_csv(java_data_frame, "java")

    print("Getting Python CSVs")
    python_csvs = [directory + '/output/' + line.replace('/', '-').replace('\n', '') + "_python.csv" for line in lines]
    # python_data_frame = pd.read_csv("csvs/python.csv", low_memory=False, dtype=str)
    print("Reading Python CSVs")
    python_data_frame = read_data_frame(python_csvs)
    python_data_frame = filter_data_frame(python_data_frame)
    print_data_frame_to_csv(python_data_frame, "python")

    print("Merging DataFrames")
    merged = pd.merge(java_data_frame, python_data_frame, on=["class", "mutant", 'index'],
                      suffixes=['_java', '_python'], how='left')
    print("Mutating DataFrame. Adding 'equal_results'")
    merged['equal_results'] = merged['result_python'] == merged['result_java']
    print("Reordering Columns")
    merged = merged[['class', 'mutant', 'index', 'result_java', 'result_python', 'equal_results']]
    print_data_frame_to_csv(merged, "merged")
