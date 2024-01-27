n , m  = map(int, input().split())
A = list(map(int, input().split()))

def devide_minus_add(n,m) :
    global a
    a = 0
    while m > 0 :
        if m % 2 == 1 :
            a += int(A[m-1])
            m -= 1
        elif m % 2 == 0 :
            a += int(A[m-1])
            m //= 2
    
    print(a)

devide_minus_add(n,m)