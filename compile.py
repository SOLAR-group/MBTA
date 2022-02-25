import glob
from pathlib import Path

from tqdm import tqdm

from mbta.treatment.representation.files.javafile import JavaFile
from mbta.treatment.representation.files.sourcefile import SourceFile
from mbta.treatment.representation.visitor.compilevisitor import CompileVisitor

files: list[SourceFile] = [JavaFile(Path(file)) for file in glob.glob("data/java/*.java")]

compile_visitor = CompileVisitor()

progress = tqdm(files)
for file in progress:
    file.accept(compile_visitor)
