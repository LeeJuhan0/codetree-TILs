a=[]
for i in range(4) :
    i = list(map(int, input().split()))
    a.append(i)

b=[]
for i in range(4):
	for j in range(i + 1):
		b.append(a[i][j])  
print(sum(b))