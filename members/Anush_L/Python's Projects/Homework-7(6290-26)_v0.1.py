#!/user/bin/python3
a = 63
b = 67
c = 9
def odd(x):
    return bool(x & 1)
if odd(a) and odd(b) and odd(c):
    print "2"
else:
    print "1"
