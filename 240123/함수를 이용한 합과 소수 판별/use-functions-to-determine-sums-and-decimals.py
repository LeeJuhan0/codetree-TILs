a, b = map(int, input().split())

def even_number(n) :
    A = list(map(int, str(n)))
    B = sum(A)
    if B % 2 == 0 :
        return True
    return False
def prime_number(n) :
    for i in range(2,n) :
        if n % i == 0 :
            return False
    return True

cnt = 0
for i in range(a, b+1) :
    if even_number(i) and prime_number(i) :
        cnt += 1

print(cnt)