def add(a):
    A = []
    for i in range(1,a+1) :
        A.append(i)
    print(int(sum(A)/10))


num = int(input())
add(num)