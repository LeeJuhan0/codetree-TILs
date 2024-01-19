N, M = map(int, input().split())
a = []

def greatest_common_divisor(n, m):
    for i in range(1,m):
        if m % i == 0 and n % i == 0:
            a.append(i)

greatest_common_divisor(N, M)
print(max(a))