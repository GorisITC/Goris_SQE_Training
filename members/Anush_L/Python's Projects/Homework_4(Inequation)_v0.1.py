#!/usr/bin/python3
print "X^2 / 2 > n"
try:
	n = input("Please enter n value: ")
	x = 0
	if type(n) == int:
		while n >= x * x / 2:
			x = x + 1
	print "The minimum value of X is: " + str(x)
except NameError:
	print  "n should be only a number"
