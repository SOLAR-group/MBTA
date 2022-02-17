import glob
from pathlib import Path

from tqdm import tqdm
from progressbar import ProgressBar

from mbta.treatment.representation.files.javafile import JavaFile
from mbta.treatment.representation.files.pythonfile import PythonFile
from mbta.treatment.representation.files.sourcefile import SourceFile
from mbta.treatment.representation.visitor.translatevisitor import TranslateVisitor

# files: list[SourceFile] = [JavaFile(Path(file)) for file in glob.glob("data/java/*.java")]
files: list[SourceFile] = [PythonFile(Path(file)) for file in glob.glob("data/python/*.py")]
# files.extend([PythonFile(Path(file)) for file in glob.glob("data/python/*.py")])
translate_visitor = TranslateVisitor("../TransCoder")
progress = tqdm(files)
for file in progress:
    progress.set_description("Translating " + file.source_path.name)
    file.accept(translate_visitor)
