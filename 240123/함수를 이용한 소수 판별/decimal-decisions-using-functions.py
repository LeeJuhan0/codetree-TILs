a, b = map(int, input().split())

def is_prime(n) :
    for i in range(2,n):
        if n % i == 0 :
            return False

    return True


list = []

for i in range(a, b+1) :
    if is_prime(i) :
        list.append(i)

if a == b :
    print('0')
else :
    print(sum(list))