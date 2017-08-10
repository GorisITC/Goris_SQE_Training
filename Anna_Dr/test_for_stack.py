class stack:
	def __init__(self):
		self.cont = []
	def push (self,x):
		self.cont.append(x)
		print self.cont
	def pop (self):
		self.cont.pop()
		print self.cont 
	def isEmpty (self):
		return len(self.cont) == 0
char1 = stack()
char1.push("content1")
char1.push("content2")
char1.pop()
char1.pop()
print char1.isEmpty()



	
	
