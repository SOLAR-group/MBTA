import abc
from pathlib import Path

from mbta.treatment.representation.visitor.classvisitor import ClassVisitor


class SourceFile:

    def __init__(self, source_path: Path):
        self.source_path = source_path.resolve()

    @abc.abstractmethod
    def accept(self, visitor: ClassVisitor):
        pass
