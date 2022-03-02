import os.path
import subprocess
import sys
from pathlib import Path

from mbta.treatment.representation.files.javafile import JavaFile
from mbta.treatment.representation.files.pythonfile import PythonFile
from mbta.treatment.representation.files.sourcefile import SourceFile
from mbta.treatment.representation.visitor.executorvisitor import ExecutorVisitor


def create_file_representation(path: Path) -> SourceFile:
    if path.suffix == ".py":
        return PythonFile(path)
    elif path.suffix == ".java":
        return JavaFile(path)
    else:
        pass


def unzip_mutant(path: str, mutant: str):
    mutant_path = Path("MuJava/result/" + mutant)
    command = f'''
cd {path}
unzip -q -o MuJava.zip "{mutant_path.with_suffix(".class")}"
'''
    with subprocess.Popen(command, shell=True) as process_object:
        process_object.wait()


def zip_results(path: str, mutant: str):
    mutant_path = Path("MuJava/result/" + mutant)
    command = f'''
cd {path}
zip -q "{sys.argv[3]}" "{mutant_path.with_suffix(".csv")}"
'''
    with subprocess.Popen(command, shell=True) as process_object:
        process_object.wait()


def remove_dir(path: str, mutant: str):
    mutant_path = Path("MuJava/result/" + mutant)
    command = f'''
cd {path}
rm -rf "{mutant_path.parent}"
'''
    with subprocess.Popen(command, shell=True) as process_object:
        process_object.wait()


try:
    unzip_mutant(sys.argv[1], sys.argv[2])
    file = create_file_representation(Path(os.path.join(sys.argv[1], "MuJava", "result", sys.argv[2])))
    print("Executing " + str(file.source_path))
    translate_visitor = ExecutorVisitor()
    file.accept(translate_visitor)
    print("Zipping results...")
    zip_results(sys.argv[1], sys.argv[2])
finally:
    print("Removing files...")
    remove_dir(sys.argv[1], sys.argv[2])
    print("Done!")
