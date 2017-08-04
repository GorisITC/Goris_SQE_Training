#!/usr/bin/python3
class cal:
	def __init__(self,x,y):
		print type(self)
		self.arg1 = x
		self.arg2 = y
	def gumarum (self):
		if type(self.arg1) == int or type(self.arg1) == float:
			if type(self.arg2) == int or type(self.arg2) ==float:
				return self.arg1 + self.arg2
			else:
				print "Please enter only numbers."
		else:
			print "Please enter only numbers."
	def hanum (self):
		if type(self.arg1) == int or type(self.arg1) == float:
			if type(self.arg2) == int or type(self.arg2) ==float:
				return self.arg1 - self.arg2
			else:
				print "Please enter only numbers."
		else:
			print "Please enter only numbers."
	def bazmapatkum (self):
		if type(self.arg1) == int or type(self.arg1) == float:
			if type(self.arg2) == int or type(self.arg2) ==float:
				return self.arg1 * self.arg2
			else:
				print "Please enter only numbers."
		else:
			print "Please enter only numbers."
	def bajanum (self):
		if type(self.arg1) == int or type(self.arg1) == float:
			if type(self.arg2) == int or type(self.arg2) ==float:
				if not self.arg2 == 0:
					return self.arg1 / self.arg2
				else:
					print "Number should not be divided by zero."
			else:
				print "Please enter only numbers."
		else:
			print "Please enter only numbers."

a = cal(10,5)
a.gumarum()
print a.gumarum()
a.hanum()
print a.hanum()
a.bazmapatkum()
print a.bazmapatkum()
a.bajanum()
print a.bajanum()
