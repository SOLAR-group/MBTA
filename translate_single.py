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
unzip -q -o MuJava.zip "MuJava/result/{mutant}"
'''
    with subprocess.Popen(command, shell=True) as process_object:
        process_object.wait()


def remove_mutant(path: str, mutant: str):
    translated_path = Path("MuJava/result/" + mutant)
    translated_path = translated_path.with_name(translated_path.stem + "_TRANSLATED.py")
    command = f'''
cd {path}
rm "MuJava/result/{mutant}"
rm "{translated_path}"
'''
    print(translated_path)
    with subprocess.Popen(command, shell=True) as process_object:
        process_object.wait()


def zip_translated_mutant(path: str, mutant: str):
    translated_path = Path("MuJava/result/" + mutant)
    translated_path = translated_path.with_name(translated_path.stem + "_TRANSLATED.py")
    command = f'''
cd {path}
zip -q MuJava.zip "{translated_path}"
'''
    with subprocess.Popen(command, shell=True) as process_object:
        process_object.wait()


try:
    unzip(sys.argv[1], sys.argv[2])
    file = create_file_representation(Path(os.path.join(sys.argv[1], "MuJava", "result", sys.argv[2])))
    print("Translating " + str(file.source_path))
    translate_visitor = TranslateVisitor(os.path.join(sys.argv[1], "TransCoder"))
    file.accept(translate_visitor)
    print("Zipping translation...")
    zip_translated_mutant(sys.argv[1], sys.argv[2])
finally:
    print("Removing files...")
    remove_mutant(sys.argv[1], sys.argv[2])
    print("Done!")
