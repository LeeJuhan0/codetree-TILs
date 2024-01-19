N = int(input())
number=[1, 2, 3, 4, 5, 6, 7, 8, 9]


def numberrectangle(n) :
    for k in range(n):
        for i in range(n):
            print(number[(i+4*k)%9], end=" ")
        print()    


numberrectangle(N)