class Calculator:
	def __init__(self,b,n):
		self.arg1=b
		self.arg2=n
	def bajanum(self):
		return self.arg1/self.arg2 *1.0

x=7
y=4
mu=Calculator(x,y)
if not y==0:
	print mu.bajanum()
else:
	print "unable to complete the action"

