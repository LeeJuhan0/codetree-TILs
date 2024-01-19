N = int(input())
number=[]
for j in range(N**N):
    for i in range(1,10) :
        number.append(i)

def numberrectangle(n) :
    for k in range(n):
        for i in range(4*k,n+4*k):
            print(number[i], end=" ")
        print()    


numberrectangle(N)