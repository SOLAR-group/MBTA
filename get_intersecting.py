import glob
from pathlib import Path

from mbta.treatment.representation.files.javafile import JavaFile
from mbta.treatment.representation.files.pythonfile import PythonFile
from mbta.treatment.representation.files.sourcefile import SourceFile

python_files: set = set([Path(file).stem for file in glob.glob("data/python/*.py")])
python_files = python_files - set([Path(file).stem for file in glob.glob("data/python/*_MAIN.py")])

java_files: set = set([Path(file).stem for file in glob.glob("data/java/*.java")])
java_files = java_files - set([Path(file).stem for file in glob.glob("data/java/*_MAIN.java")])

# intersection = python_files.intersection(java_files)

# with open("intersecting_classes.txt", "w+") as classes_file:
#     [classes_file.write(clazz + "\n") for clazz in intersection]

with open("intersecting_classes.txt", "r") as classes_file:
    intersection = [clazz.replace("\n", "") for clazz in classes_file]

with open("intersecting_java_mutants.txt", "w+") as intersecting_mutants_file, open("java_mutants.txt", "r") as java_mutants_file:
    java_mutants = java_mutants_file.readlines()
    for java_mutant in java_mutants:
        if java_mutant.split("/")[0] in intersection:
            intersecting_mutants_file.write(java_mutant)

with open("intersecting_translated_python_mutants.txt", "w+") as intersecting_mutants_file, open("python_translated_mutants.txt", "r") as python_mutants_file:
    python_mutants = python_mutants_file.readlines()
    for python_mutant in python_mutants:
        if python_mutant.split("/")[0] in intersection:
            intersecting_mutants_file.write(python_mutant)
