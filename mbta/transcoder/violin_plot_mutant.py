import os

import matplotlib.pyplot as plt
import pandas as pd
import seaborn as sns
from pandas import DataFrame
from tqdm import tqdm


def analyse_mutant():
    progress = tqdm(lines)
    for line in progress:
        line = line.replace("\r\n", "").replace('\n', '')
        mutant_dir = directory + line.replace(".java", "")

        result = dict()
        python_translated = mutant_dir + '_TRANSLATED.py'
        result["translated"] = os.path.isfile(python_translated) and os.path.getsize(python_translated) > 0

        python_compiled = mutant_dir + '_TRANSLATED.pyc'
        result["compiled"] = os.path.isfile(python_compiled) and os.path.getsize(python_compiled) > 0

        python_output = mutant_dir + "_TRANSLATED.csv"
        result["runnable"] = os.path.isfile(python_output) and os.path.getsize(python_output) > 0

        if result["runnable"]:
            with open(python_output, 'r') as output_file:
                output_lines = output_file.readlines()
            result["success"] = len(output_lines) == 11 and not any("EXCEPTION" in element for element in output_lines)
        else:
            result["success"] = False

        yield result


if __name__ == "__main__":
    directory = '../../../MuJava/result/'
    with open(f'../../intersecting_java_mutants.txt', 'r') as mutants_file:
        lines = mutants_file.readlines()

    programs = [item.split("/")[0] for item in lines]
    mutants = [item.split("/")[-1].replace("\r\n", "").replace('\n', '') for item in lines]

    mutant_results = analyse_mutant()

    data = DataFrame({'Program': programs, 'Mutant': mutants})
    data[["Translated", "Compiled", "Runnable", "Success"]] = pd.DataFrame(mutant_results)

    if not os.path.exists("csvs"):
        os.makedirs("csvs", exist_ok=True)
    data.to_csv("csvs/transcoder_mutants.csv", index=False)
    # data = pd.read_csv("csvs/transcoder_mutants.csv")
    percentage = lambda item: sum(item) / len(item)
    grouped = data.groupby('Program').agg({"Mutant": "size",
                                           "Compiled": percentage,
                                           "Translated": percentage,
                                           "Runnable": percentage,
                                           "Success": percentage})
    if not os.path.exists("plots"):
        os.makedirs("plots", exist_ok=True)

    plt.figure()
    violin = sns.violinplot(data=grouped, y="Mutant", cut=0, bw=0.01)
    violin.set(ylabel="Number of Generated Mutants per Class")
    plt.savefig('plots/violin_number_mutants.png')

    plt.figure()
    violin = sns.violinplot(data=grouped, y="Translated", cut=0, bw=0.01)
    violin.set(ylabel="Percentage of Translated Mutants per Class")
    plt.savefig('plots/violin_number_translated_mutants.png')

    plt.figure()
    violin = sns.violinplot(data=grouped, y="Compiled", cut=0, bw=0.01)
    violin.set(ylabel="Percentage of Compiled Mutants per Class")
    plt.savefig('plots/violin_number_compiled_mutants.png')

    plt.figure()
    violin = sns.violinplot(data=grouped, y="Runnable", cut=0, bw=0.01)
    violin.set(ylabel="Percentage of Runnable Mutants per Class")
    plt.savefig('plots/violin_number_runnable_mutants.png')

    plt.figure()
    violin = sns.violinplot(data=grouped, y="Success", cut=0, bw=0.01)
    violin.set(ylabel="Percentage of Success Mutants per Class")
    plt.savefig('plots/violin_number_success_mutants.png')
