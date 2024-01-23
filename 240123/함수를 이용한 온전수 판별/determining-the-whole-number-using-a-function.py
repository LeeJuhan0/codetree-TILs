a, b = map(int, input().split())

def Judge(n) :
    if n % 2 == 0 :
        return False
    elif n % 5 == 0 and n %10 != 0 :
        return False
    elif n % 3 == 0 and n % 9 != 0 :
        return False
    return True

cnt = 0
for i in range(a,b+1) :
    if Judge(i) :
        cnt += 1

print(cnt)