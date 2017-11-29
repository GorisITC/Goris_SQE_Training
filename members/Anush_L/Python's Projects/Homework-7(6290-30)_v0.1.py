#!/user/bin/python3
a = 30
b = 25
c = 100
k = ", "
if a > b and b < c:
    if a < c:
        print str(c) + k + str(a) + k + str(b)
    else:
        print a + k + c + k + b
elif a > c and c < b:
    if a < b:
        print b + k + a + k + c
    else:
        print a + k + b + k + c
else:
   if b < c:
       print c + k + b + k + a
   else:
       print b + k + c + k + a
