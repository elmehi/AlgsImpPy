class myPriorityQueue:
    def __init__(self, es = []):
        self.es = sorted(list(es))
    def put(self, e):
        self.es.insert(0, e)
        self.es.sort()
    def pop(self):
        return self.es.pop()
    def peek(self):
        return self.es[-1]
    def size(self):
        return len(self.es)
    def debug(self):
        return self.es