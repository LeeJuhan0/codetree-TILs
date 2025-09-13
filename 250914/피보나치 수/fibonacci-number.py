N = int(input())

# Please write your ode here.
def fibo(N):
    if N == 1 :
        return 1
    elif N == 2:
        return 1
    return fibo(N-1) + fibo(N-2)
print(fibo(N))