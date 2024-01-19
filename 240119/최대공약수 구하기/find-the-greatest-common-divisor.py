N, M = map(int, input().split())
a = []

def greatest_common_divisor(n, m):
    if n == m :
        a.append(n)
    elif m > n :
        for i in range(1,m):
            if m % i == 0 and n % i == 0:
                a.append(i)
    elif n > m :
        for i in range(1,n):
            if m % i == 0 and n % i == 0:
                a.append(i)


greatest_common_divisor(N, M)
print(max(a))