import abc


class ClassVisitor:

    @abc.abstractmethod
    def visit_java_file(self, source_file):
        pass

    @abc.abstractmethod
    def visit_python_file(self, source_file):
        pass
