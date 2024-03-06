N = int(input())

def f(n):
    if n == 1 :
        return 0 
    
    if n % 2 == 0 and n > 1:
        return f(int(n // 2)) + 1
    elif n % 2 == 1 and n > 1:
        return f(int(n // 3)) + 1
   


print(f(N))