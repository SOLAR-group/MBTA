import glob
from pathlib import Path

from tqdm import tqdm

from mbta.treatment.representation.files.javafile import JavaFile
from mbta.treatment.representation.files.sourcefile import SourceFile
from mbta.treatment.representation.visitor.compilevisitor import CompileVisitor

import multiprocessing as mp
from tqdm.contrib.concurrent import process_map


def execute(file):
    compile_visitor = CompileVisitor()
    file.accept(compile_visitor)


if __name__ == '__main__':
    files: list[SourceFile] = [JavaFile(Path(file)) for file in
                               glob.glob("../MuJava/result/*/traditional_mutants/*/*/*.java")]

    r = process_map(execute, files, max_workers=mp.cpu_count(), chunksize=50)
