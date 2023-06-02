import os

import matplotlib.pyplot as plt
import pandas as pd
import scipy
import seaborn as sns
from scipy import stats
from pandas import DataFrame
from progress.bar import Bar

pd.options.display.max_columns = None
pd.options.display.max_rows = None

def save_violin_plot(data, y_column, y_label, output_path):
    plt.figure()
    # Create violin plots without mini-boxplots inside.
    violin = sns.violinplot(x='Translator', y=y_column, data=data,
                            palette="Accent",
                            cut=0, bw=0.03, inner=None)
    violin.set(ylabel=y_label)
    sns.boxplot(x='Translator', y=y_column, data=data, width=0.25,
                showfliers=False, showmeans=True,
                meanprops=dict(marker='X', markerfacecolor='black', markeredgecolor='white',
                               markersize=8, zorder=3),
                boxprops=dict(facecolor=(0, 0, 0, 0),
                              linewidth=3, zorder=3),
                whiskerprops=dict(linewidth=3),
                capprops=dict(linewidth=3),
                medianprops=dict(linewidth=3))
    plt.legend(frameon=False, fontsize=15, loc='upper left')

    plt.savefig(output_path, bbox_inches='tight')

if __name__ == "__main__":
    data_transcoder = pd.read_csv("csvs/merged_mutants.csv")
    data_transcoder["Translator"] = "TransCoder"
    data_j2py = pd.read_csv("../j2py/csvs/merged_mutants.csv")
    data_j2py["Translator"] = "j2py"

    data = data_transcoder.append(data_j2py)

    if not os.path.exists("plots"):
        os.makedirs("plots", exist_ok=True)

    percentage = lambda item: sum(item) / len(item)
    aggregate_mutants = lambda item: not all(item)

    # operator_mts = "Mutation-based Translation Score"
    # operator_grouped: DataFrame = data_transcoder.replace(to_replace=r'_.*', value='', regex=True)
    # operator_grouped = operator_grouped.groupby(["class", "mutant"]).agg({"equal_results": len}).reset_index()
    # operator_grouped["equal_results"] = operator_grouped["equal_results"] / 10
    # number_name = "Number of Generated Mutants"
    # operator_grouped = operator_grouped.rename(columns={"equal_results": number_name, "mutant": "Mutation Operator"})
    # print(operator_grouped)
    # save_violin_plot(data=operator_grouped, y_column=number_name, y_label=number_name, output_path="plots/violin_operator_mts.png")

    # Find the mutants with all at least one different output outputs
    mts_name = "Mutation-based Translation Score"
    grouped = data.groupby(['Translator', 'class', 'mutant'])\
        .agg({"equal_results": aggregate_mutants})\
        .reset_index().groupby(["Translator", "class"])\
        .agg({"mutant": 'count', "equal_results": percentage})
    grouped = grouped.rename(columns={"equal_results": mts_name})
    grouped = grouped.reset_index()

    save_violin_plot(data=grouped, y_column=mts_name, y_label=mts_name, output_path="plots/violin_mts_joint.png")

    data_transcoder = pd.read_csv("csvs/merged_original.csv")
    data_transcoder["Translator"] = "TransCoder"
    data_j2py = pd.read_csv("../j2py/csvs/merged_original.csv")
    data_j2py["Translator"] = "j2py"

    data = data_transcoder.append(data_j2py)
    # Group by class and get the percentage of mutants that survived
    original_grouped = data.groupby(['Translator', "class"]).agg({'equal_results': percentage})
    accuracy_name = "Computational Accuracy"
    original_grouped = original_grouped.rename(columns={"equal_results": accuracy_name})
    original_grouped = original_grouped.reset_index()

    save_violin_plot(data=original_grouped, y_column=accuracy_name, y_label=accuracy_name, output_path='plots/violin_computational_accuracy_joint.png')

    merged = grouped.merge(original_grouped, on=["class", "Translator"])
    merged = merged.reset_index()

    temp = merged[merged["Translator"] == "TransCoder"]
    plt.figure()
    plt.scatter(temp[mts_name], temp[accuracy_name], c="#88c088")
    plt.xlabel(mts_name)
    plt.ylabel(accuracy_name)
    plt.savefig("plots/scatter_transcoder.png", bbox_inches='tight')

    temp = merged[merged["Translator"] == "j2py"]
    plt.figure()
    plt.scatter(temp[mts_name], temp[accuracy_name], c="#bfb3cf")
    plt.xlabel(mts_name)
    plt.ylabel(accuracy_name)
    plt.savefig("plots/scatter_j2py.png", bbox_inches='tight')

    plt.figure()
    plt.scatter(y=merged[mts_name], x=merged["mutant"])
    plt.xlabel("Number of Mutants")
    plt.ylabel(mts_name)
    plt.savefig("plots/scatter_correlation_nmutants_mts.png", bbox_inches='tight')

    plt.figure()
    plt.scatter(y=merged[accuracy_name], x=merged["mutant"])
    plt.xlabel("Number of Mutants")
    plt.ylabel(accuracy_name)
    plt.savefig("plots/scatter_correlation_nmutants_acc.png", bbox_inches='tight')

    print(stats.spearmanr(merged[mts_name], merged["mutant"]))
    print(stats.spearmanr(merged[accuracy_name], merged["mutant"]))

