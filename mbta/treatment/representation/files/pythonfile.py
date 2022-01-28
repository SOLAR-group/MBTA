from mbta.treatment.representation.files.sourcefile import SourceFile


class PythonFile(SourceFile):
    def accept(self, visitor):
        return visitor.visit_python_file(self)
