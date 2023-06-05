# MBTA

This is a repository with all the required script files to run the experiments of our paper.

The directory `data` contains all the original programs used in our experiments, both in Java and Python.
Inside each directory, you will find the compiled class (Java), the original source code (program.java or program.py), the main class with all the tests (program_MAIN.java or program_MAIN.py), and a CSV file with the execution results for that program.

The directory `mbta/treatment/representation/visitor` contains all the scripts needed to modify the dataset in order toa allow their execution, including mutants. Each visitor will run the specific task over the given files.

The directories `mbta/j2py` and `mbta/transcoder` contain scripts to run the data analysis over the specific results of both translators. Moreover, the former has data analysis scripts with joint results of both translators, such as `mbta/transcoder/violin_plot_mtss_joint.py` to generate the violin plots shown in our paper.

The directories under `test` contain scripts for modifying the test files.

The root file of this repository has all the scripts used to perform the tasks of MBTA as follows:

-----

1. Copy mains to new file (`copy_mains.py`)
2. Remove mains from original (`extract_mains.py`)
3. Generate mutants (using MuJava)

-----

1. Copy mains to original (`copy_mains.py`)
2. Compile originals (`compile.py`)
3. Execute originals (`execute_originals.py`)

-----

1. Copy mains to original mutants (`copy_mains_mutants.py`)
2. Compile original mutants (`compile_mutants.py`)
3. Translate original mutants (`translate_single.py`)
4. Execute original mutants (`execute_single.py`)
5. Copy mains to translated mutants (`copy_mains_mutants.py`)
6. Compile translated mutants (`compile_mutants.py`)
7. Execute translated mutants (`execute_mutants.py`)
