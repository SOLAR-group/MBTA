from mbta.treatment.representation.files.sourcefile import SourceFile


class JavaFile(SourceFile):
    def accept(self, visitor):
        return visitor.visit_java_file(self)
