class Calculator:
	def __init__(self,x,y):
		self.arg1=x
		self.arg2=y
	def gum(self):
		return self.arg1+self.arg2

a=Calculator(5,8)
a.gum()
print a.gum()
