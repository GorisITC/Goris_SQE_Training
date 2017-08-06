#!/user/bin/python3
a = 18
b = 4
c = 12
d = 2
def fa(a):
    if a == b + c + d:
        return True
    else:
        return False
def fb(b):
    if b == a + c + d:
        return True
    else:
        False
def fc(c):
    if c == a + b + d:
        return True
    else:
        return False
def fd(d):
    if d == a + b + c:
        return True
    else:
        return False
if fa(a) == True or fb(b) == True or fc(c) == True or fd(d) == True:
    print True
else:
    print False

