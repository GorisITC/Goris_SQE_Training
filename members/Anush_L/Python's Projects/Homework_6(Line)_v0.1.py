#!/usr/bin/python3
class line:
	def __init__(self):
		self.cont = []
	def push (self,x):
		self.cont.append(x)
		print self.cont
	def pop (self):
		return self.cont.pop(0)
		print self.cont
	def isEmpty (self):
		return len(self.cont) == 0
		print self.cont
		
st = line()
st.push('a')
st.push('b')
st.push(5)
st.isEmpty()
st.pop()
st.push(1)
st.isEmpty()
