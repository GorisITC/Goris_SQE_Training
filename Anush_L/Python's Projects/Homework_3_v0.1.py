print "X^2 / 2 > n"
x = input("Please enter X value: ")
n = 0
if type(x) == int:
	n = x * x / 2
	n = n - 1
	print "The maximum value of n is: " + str(n)
else:
	print "X should be only a number"
