a=[]
for i in range(4) :
    i = list(map(int, input().split()))
    a.append(i)

b=[]
for i in range(4):        
    b.append(a[i][i])

for i in range(3):        
    b.append(a[i+1][i])

for i in range(2):        
    b.append(a[i+2][i])

for i in range(1):        
    b.append(a[i+3][i])    
print(sum(b))