N = int(input())

# Please write your ode here.
fibo = [1] * 45
for i in range(2,N):
    fibo[i] = fibo[i-1] + fibo[i-2]

print(fibo[N-1])