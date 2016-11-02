# without using pop or insert
class myQueue:
    def __init__(self, es = []):
        self.es = list(es)
    def put(self, e):
        self.es.insert(0, e)
    def pop(self):
        return self.es.pop()
    def peek(self):
        return self.es[-1]
    def size(self):
        return len(self.es)