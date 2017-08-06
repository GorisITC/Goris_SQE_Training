#!/user/bin/python3
a = [200,100,50]
def gp(a):
    a[1] = a[1] * 1.0
    b = a[1] / a[0]
    c = 2
    while c < len(a):
        if a[c] == a[c-1] * b:
            return True
        else:
            return False
        c = c + 1

if gp(a) == True:
    print "Geometric Progression"
else:
    print "Non Geometric Progression"
