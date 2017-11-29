class Calculator:
    def __init__(self,x,y):
        self.arg1 = x
        self.arg2 = y
    def gum(self):
    	return self.arg1 + self.arg2
    def han(self):
        return self.arg1 - self.arg2
    def baz(self):
        return self.arg1 * self.arg2
    def baj(self):
        if self.arg2 == 0:
            pass
        else: 
            return self.arg1 / self.arg2 
a= Calculator(0,6)
a.gum()
a.han()
a.baz()
a.baj()
h = a.han()
g = a.gum()
b = a.baz()
bj = a.baj()
print g
print h
print b
print bj

