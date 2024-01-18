n = int(input())
a = []
for i in range(1,n+1) :
    if i % 2  == 0 or i % 3 == 0 :
        a.append('1')
    else :
        a.append('0')

print(*a)