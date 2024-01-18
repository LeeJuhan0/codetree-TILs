a = str(input())
b=list(a)
b[3:8], b[8:13]=b[8:13], b[3:8]
c=('').join(b)
print(c)