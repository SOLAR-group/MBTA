import glob
import os.path
from pathlib import Path

from mbta.treatment.representation.files.javafile import JavaFile
from mbta.treatment.representation.files.pythonfile import PythonFile
from mbta.treatment.representation.files.sourcefile import SourceFile
from mbta.treatment.representation.visitor.extractmainvisitor import ExtractMainVisitor

# [os.remove(file) for file in glob.glob("data/java/*_MAIN_MAIN.java")]
from mbta.treatment.representation.visitor.removemainvisitor import RemoveMainVisitor

files: list[SourceFile] = [JavaFile(Path(file)) for file in glob.glob("data/java/*.java")]
files.extend([PythonFile(Path(file)) for file in glob.glob("data/python/*.py")])
extract_main_visitor = ExtractMainVisitor()
remove_main_visitor = RemoveMainVisitor()

for file in files:
    file.accept(extract_main_visitor)
    file.accept(remove_main_visitor)
