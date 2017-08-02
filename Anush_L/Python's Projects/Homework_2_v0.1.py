v = "Valid email"
iv = "Invalid email"
ln = 0
ch = 0
s = 0
t = 0
email = raw_input("Enter your email: ")

if len(email) > 5:
    ln = ln + 1
for i in email:
    if i.isalpha() == True:
        ch = ch + 1
for i in email:
    if i == "@":
        s = s + 1
for i in email:
    if i == ".":
        t = t + 1
if not ln == 0 and not ch == 0 and not s == 0 and not t == 0:
    print v
else:
    print iv
