class myStack:
    def __init__(self, es = []):
        self.es = list(es)
    def push(self, e):
        self.es.append(e)
    def pop(self):
        e = self.es[-1]
        self.es = self.es[:-1]
        return e
    def size(self):
        return len(self.es)
    def peek(self):
        return self.es[-1]