a, b = map(int, input().split())

def calculate(n,k) :
    global a 
    a = n
    global b
    b = k
    if a > b :
        a *= 2
        b += 10
    elif b > a :
        b *= 2
        a += 10


    
calculate(a,b)
print(a,b)