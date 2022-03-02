import glob
from pathlib import Path

from tqdm import tqdm

from mbta.treatment.representation.files.javafile import JavaFile
from mbta.treatment.representation.files.pythonfile import PythonFile
from mbta.treatment.representation.files.sourcefile import SourceFile
from mbta.treatment.representation.visitor.copymainvisitor import CopyMainVisitor

files: list[SourceFile] = [JavaFile(Path(file)) for file in glob.glob("../MuJava/result/*/traditional_mutants/*/*/*.java")]
# files: list[SourceFile] = [JavaFile(Path(file)) for file in glob.glob("../MuJava/result/ADD_1_TO_A_GIVEN_NUMBER/traditional_mutants/*/AOIS_1/*.java")]
copy_main_visitor = CopyMainVisitor("data/java/")

progress = tqdm(files)
for file in progress:
    file.accept(copy_main_visitor)

# files: list[SourceFile] = [PythonFile(Path(file)) for file in glob.glob("data/python/*.py")]
# copy_main_visitor = CopyMainVisitor("data/python/")
#
# for file in files:
#     file.accept(copy_main_visitor)
