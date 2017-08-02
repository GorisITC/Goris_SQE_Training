n = 0
n1 = 0
n2 = 0
r = 0
def nn (a):
	print "Please enter only numbers."

def gumarum (n,n1):
	if type(n) == int or type(n) == float:
		 if type(n1) == int or type(n1) ==float:
			r = n + n1
			print r
		 else:
			nn(1)
	else:
		nn(1)
def gumarum (n,n1,n2):
	if type(n) == int or type(n) == float:
		if type(n1) == int or type(n1) ==float:
			if type(n2) == int or type(n2) == float:
				r = n + n1 + n2
				print r
			else:
				nn(1)
		else:
			nn(1)
	else:
		nn(1)
def hanum (n,n1,n2):
	if type(n) == int or type(n) == float:
		if type(n1) == int or type(n1) ==float:
			if type(n2) == int or type(n2) == float:	
				r = n -n1 - n2
				print r
			else:
				nn(1)
		else:
			nn(1)
	else:
		nn(1)
def bazm (n,n1,n2):
	if type(n) == int or type(n) == float:
		if type(n1) == int or type(n1) ==float:
			if type(n2) == int or type(n2) == float:
				r = n * n1 * n2
				print r
			else:
				nn(1)
		else:
			nn(1)
	else:
		nn(1)
def baj (n,n1):
	if type(n) == int or type(n) == float:
		if type(n1) == int or type(n1) ==float:
			if not n1 == 0:
				n = n * 1.0
				r = n / n1 
				print r
			else:
				print "Number should not be divided by zero."
		else:
			nn(1)
	else:nn(1)
gumarum (1,15,n2)
hanum (10,4,0)
bazm (4,2,1)
baj (19,2)
baj (15,0)
baj ("c",8)
