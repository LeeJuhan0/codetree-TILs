n = int(input())
m = list(map(int, input().split()))

dp = [0 for _ in range(n)]

for i in range(n):
    for j in range(i+1, n):
        if m[i] < m[j]:
            dp[j] = max(dp[j], dp[i] + 1)

print(max(dp) + 1)        
            
