import glob
from pathlib import Path

from mbta.treatment.representation.files.javafile import JavaFile
from mbta.treatment.representation.files.pythonfile import PythonFile
from mbta.treatment.representation.files.sourcefile import SourceFile
from mbta.treatment.representation.visitor.copymainvisitor import CopyMainVisitor

files: list[SourceFile] = [JavaFile(Path(file)) for file in glob.glob("data/java/*.java")]
copy_main_visitor = CopyMainVisitor("data/java/")

for file in files:
    file.accept(copy_main_visitor)

files: list[SourceFile] = [PythonFile(Path(file)) for file in glob.glob("data/python/*.py")]
copy_main_visitor = CopyMainVisitor("data/python/")

for file in files:
    file.accept(copy_main_visitor)
