gr = ["a", "apple",  "orange", "78", "15", "blue"]
gr1 = ["kkk", "897", "test", "orange", "15"]
ch = 0
for word in gr:
	for word1 in gr1: 
		if word == word1:
			print word
			ch = ch + 1
if ch == 0:
	print "No"
