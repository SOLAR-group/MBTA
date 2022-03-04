import glob
from pathlib import Path

from tqdm import tqdm

from mbta.treatment.representation.files.javafile import JavaFile
from mbta.treatment.representation.files.pythonfile import PythonFile
from mbta.treatment.representation.files.sourcefile import SourceFile
from mbta.treatment.representation.visitor.copymainvisitor import CopyMainVisitor
from mbta.treatment.representation.visitor.treattranslatedvisitor import TreatTranslatedVisitor

with open("intersecting_translated_python_mutants.txt", "r") as mutants_file:
    files = [PythonFile(Path("..", "MuJava", "result", str(mutant).strip("\n"))) for mutant in mutants_file]
treat_translated_visitor = TreatTranslatedVisitor("data/python/")

progress = tqdm(files)
for file in progress:
    file.accept(treat_translated_visitor)
