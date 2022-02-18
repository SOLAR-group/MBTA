import os.path
import subprocess
import sys
from pathlib import Path

from mbta.treatment.representation.files.javafile import JavaFile
from mbta.treatment.representation.files.pythonfile import PythonFile
from mbta.treatment.representation.files.sourcefile import SourceFile
from mbta.treatment.representation.visitor.translatevisitor import TranslateVisitor


def create_file_representation(path: Path) -> SourceFile:
    if path.suffix == ".py":
        return PythonFile(path)
    elif path.suffix == ".java":
        return JavaFile(path)
    else:
        pass


def unzip(path: str, mutant: str):
    command = f'''
cd {path}
unzip -q MuJava.zip "MuJava/result/{mutant}"
'''
    with subprocess.Popen(command, shell=True) as process_object:
        process_object.wait()


def remove_mutant(path: str, mutant: str):
    command = f'''
cd {path}
rm "MuJava/result/{mutant}"
'''
    with subprocess.Popen(command, shell=True) as process_object:
        process_object.wait()


try:
    unzip(sys.argv[1], sys.argv[2])
    file = create_file_representation(Path(os.path.join(sys.argv[1], "MuJava", "result", sys.argv[2])))
    print("Translating " + str(file.source_path))
    translate_visitor = TranslateVisitor("../TransCoder")
    file.accept(translate_visitor)
    print("Done!")
finally:
    remove_mutant(sys.argv[1], sys.argv[2])
