import os

import pandas as pd
import seaborn as sns
from pandas import DataFrame
from progress.bar import Bar
import matplotlib.pyplot as plt


def analyse_mutant():
    with Bar('Processing', max=len(lines)) as bar:
        bar.check_tty = False
        for line in lines:
            bar.next()
            line = line.replace('\n', '')
            split_line = line.split('/')
            mutant_dir = directory + '/mutants/' + line + '/' + split_line[0]

            result = dict()
            python_translated = mutant_dir + '.py'
            result["translated"] = os.path.isfile(python_translated) and os.path.getsize(python_translated) > 0

            python_compiled = mutant_dir + '.pyc'
            result["compiled"] = os.path.isfile(python_compiled) and os.path.getsize(python_compiled) > 0

            output_dir = directory + '/output/' + line.replace('/', '-')
            python_output = output_dir + "_python.csv"
            result["runnable"] = os.path.isfile(python_output) and os.path.getsize(python_output) > 0

            with open(python_output, 'r') as output_file:
                output_lines = output_file.readlines()
            result["success"] = len(output_lines) == 10 and not any("EXCEPTION" in element for element in output_lines)

            yield result


if __name__ == "__main__":
    directory = '../../TransCode'
    with open(f'{directory}/mutants.txt', 'r') as mutants_file:
        lines = mutants_file.readlines()

    programs = [item.split("/")[0] for item in lines]
    mutants = [item.split("/")[-1].replace("\n", "") for item in lines]

    mutant_results = analyse_mutant()

    data = DataFrame({'Program': programs, 'Mutant': mutants}).reset_index()
    data[["Translated", "Compiled", "Runnable", "Success"]] = pd.DataFrame(mutant_results)
    data.to_csv("j2py_mutants.csv")
    # data = pd.read_csv("j2py_mutants.csv")
    percentage = lambda item: sum(item) / len(item)
    grouped = data.groupby('Program').agg({"Mutant": "size",
                                           "Compiled": percentage,
                                           "Translated": percentage,
                                           "Runnable": percentage,
                                           "Success": percentage})

    plt.figure()
    violin = sns.violinplot(data=grouped, y="Mutant")
    violin.set(ylabel="Number of Generated Mutants per Class")
    plt.savefig('violin_number_mutants.png')

    plt.figure()
    violin = sns.violinplot(data=grouped, y="Translated")
    violin.set(ylabel="Percentage of Translated Mutants per Class")
    plt.savefig('violin_number_translated_mutants.png')

    plt.figure()
    violin = sns.violinplot(data=grouped, y="Compiled")
    violin.set(ylabel="Percentage of Compiled Mutants per Class")
    plt.savefig('violin_number_compiled_mutants.png')

    plt.figure()
    violin = sns.violinplot(data=grouped, y="Runnable")
    violin.set(ylabel="Percentage of Runnable Mutants per Class")
    plt.savefig('violin_number_runnable_mutants.png')

    plt.figure()
    violin = sns.violinplot(data=grouped, y="Success")
    violin.set(ylabel="Percentage of Success Mutants per Class")
    plt.savefig('violin_number_success_mutants.png')
