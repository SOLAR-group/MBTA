import pandas as pd
import numpy as np
import seaborn as sb
import glob
import os
import matplotlib.pyplot as plt

global non_executable

def get_huge_data_frame(csvs: list, language: str = None):
    data_frames = list()
    global non_executable
    for csv in csvs:
        if os.path.getsize(csv) > 0:
            data_frame = pd.read_csv(csv, names=["class", "mutant", "result"])
            data_frames.append(data_frame)
        else:
            non_executable += 1

    df : pd.DataFrame = pd.concat(data_frames).dropna()
    if not language == None:
        df["language"] = language
    df['index'] = df.index
    return df

if __name__ == "__main__":
    global non_executable
    # python_csvs = set(glob.glob('../Transcode/output/*original_python.csv'))
    # java_csvs = set(glob.glob('../Transcode/output/*original.csv'))
    
    # non_executable = 0
    # java_df = get_huge_data_frame(java_csvs)
    # java_df.to_csv("java_original.csv", index = False)
    # print(f'Mutants Java: {len(java_csvs)}')
    # print(f'Non-executable Java: {non_executable}')
    # print(f'No timeout Java: {len(java_df.groupby(["class","mutant"]))}')

    # non_executable = 0
    # python_df = get_huge_data_frame(python_csvs)
    # python_df.to_csv("python_original.csv", index = False)
    # print(f'Mutants Python: {len(python_csvs)}')
    # print(f'Non-executable Python: {non_executable}')
    # print(f'No timeout Python: {len(python_df.groupby(["class","mutant"]))}')

    java_df : pd.DataFrame = pd.read_csv("java_original.csv")
    python_df : pd.DataFrame = pd.read_csv("python_original.csv")

    num_perfect = len(python_df.groupby(["class", "mutant"]).filter(lambda row: len(row) == 10 and not row.result.str.contains("EXCEPTION", regex=False).any()).groupby(["class", "mutant"]))
    print(f'Programs with 10 perfect outputs Python: {num_perfect}')

    num_perfect = len(java_df.groupby(["class", "mutant"]).filter(lambda row: len(row) == 10 and not row.result.str.contains("EXCEPTION", regex=False).any()).groupby(["class", "mutant"]))
    print(f'Programs with 10 perfect outputs Java: {num_perfect}')

    merged : pd.DataFrame = pd.merge(java_df, python_df, on=["class", "mutant",'index'], suffixes=['_java', '_python'], how='left')
    merged = merged[['class','mutant','index','result_java','result_python']]

    merged.to_csv("full_original.csv", index = False, na_rep = "NA")
    merged : pd.DataFrame = pd.read_csv("full_original.csv", low_memory=False, dtype=str)
    merged = merged[merged['result_java'] != "EXCEPTION"]
    merged['equal_results'] = merged['result_python'].str.upper() == merged['result_java'].str.upper()
    merged.to_csv("full_original.csv", index = False, na_rep = "NA")
    grouped_by = merged.groupby(['class','mutant'])
    mutants_with_no_failure = len(grouped_by.filter(lambda x: x['equal_results'].all()).groupby(['class','mutant']))
    total_translation_score = mutants_with_no_failure / len(merged.groupby(["class","mutant"]))

    print(f'Mutants with no failure: {mutants_with_no_failure}')
    print(f'Total score {total_translation_score*100:#.2f}%')
    
    merged['mutant'] = merged['mutant'].replace(r'_\d+','',regex=True)
    number_of_classes = len(pd.unique(merged['class']))
    number_of_operators = len(pd.unique(merged['mutant']))

    classes_with_no_failure = pd.unique(merged.groupby('class').filter(lambda x: x['equal_results'].all())['class'])

    operators_with_no_failure = pd.unique(merged.groupby('mutant').filter(lambda x: x['equal_results'].all())['mutant'])

    percentage_of_passing_test_cases_per_class = merged.loc[merged['equal_results'] == True].groupby('class').size() / merged.groupby('class').size()
    percentage_of_passing_test_cases_per_class = percentage_of_passing_test_cases_per_class.to_frame(name = 'percentage')

    percentage_of_passing_test_cases_per_mutant = merged.loc[merged['equal_results'] == True].groupby(['mutant']).size() / merged.groupby(['mutant']).size()
    percentage_of_passing_test_cases_per_mutant = percentage_of_passing_test_cases_per_mutant.to_frame(name = 'percentage')
       
    print(f'Median score per class: {percentage_of_passing_test_cases_per_class["percentage"].median() * 100:.2f}%')
    print(f'Median score per operator: {percentage_of_passing_test_cases_per_mutant["percentage"].median() * 100:.2f}%')
    print(f'Unique classes with no failures: {len(classes_with_no_failure)}/{number_of_classes} ({len(classes_with_no_failure) / float(number_of_classes) * 100:#.2f}%)')
    print(f'Unique operators with no failures: {len(operators_with_no_failure)}/{number_of_operators} ({len(operators_with_no_failure) / float(number_of_operators) * 100:#.2f}%)')

    percentage_of_passing_test_cases_per_class.rename(columns={'percentage':'Percentage'}).boxplot(column=['Percentage'], grid=False)

    sb.violinplot(data=percentage_of_passing_test_cases_per_class, y=percentage_of_passing_test_cases_per_class['percentage'])
    
    percentage_of_passing_test_cases_per_mutant = merged.loc[merged['equal_results'] == True].groupby(['mutant', 'class']).size() / merged.groupby(['mutant', 'class']).size()
    percentage_of_passing_test_cases_per_mutant = percentage_of_passing_test_cases_per_mutant.to_frame(name = 'percentage')
    box_plot = percentage_of_passing_test_cases_per_mutant.rename_axis(index={'mutant':"Mutation Operator"}).boxplot(column=['percentage'], grid=False, by="Mutation Operator", rot=45)
    box_plot.set_ylabel('Percentage of Passing Test Cases')
    plt.title('')
    plt.suptitle('')
    