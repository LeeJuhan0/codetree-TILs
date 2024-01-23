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
        print(sum(list))
    elif a == b :
        print('0')