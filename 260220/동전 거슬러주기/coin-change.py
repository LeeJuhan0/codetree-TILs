import sys

int_max = sys.maxsize

N, M = map(int, input().split())
coin = list(map(int, input().split()))
coin.append(0)
coin.sort()
dp = [0 for _ in range(M+1)]


for i in range(M+1) :
    dp[i] = int_max

    dp[0] = 0

for i in range(1, M + 1) :
    for j in range(1, N + 1) :
        if i >= coin[j] :
            if dp[i - coin[j]] == int_max:
                continue;
            dp[i] = min(dp[i], dp[i - coin[j]] + 1)
            
            

ans = dp[M]

print(-1 if ans == int_max else ans) 

