import glob
from pathlib import Path

from tqdm import tqdm

from mbta.treatment.representation.files.pythonfile import PythonFile
from mbta.treatment.representation.files.sourcefile import SourceFile
from mbta.treatment.representation.visitor.executorvisitor import ExecutorVisitor

files: list[SourceFile] = [PythonFile(Path(file)) for file in glob.glob("data/python/*.py")]

execute_visitor = ExecutorVisitor()

progress = tqdm(files)
for file in progress:
    file.accept(execute_visitor)
