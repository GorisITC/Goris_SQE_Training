#!/user/bin/python3
import math
y = 9999
x = math.sqrt(y*18)
def ch(x):
    x = math.sqrt(y*18)
    if (x).is_integer():
        return True
    else:
        return False
if ch(x) == True:
    print "yes"
while ch(x) == False:
    y = y - 1
    if y == 999:
        break
print y+1
