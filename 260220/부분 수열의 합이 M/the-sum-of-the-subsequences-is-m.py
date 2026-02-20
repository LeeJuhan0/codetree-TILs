import sys
max_int = sys.maxsize

n, m = map(int, input().split())
A = [0] + list(map(int, input().split()))

dp = [max_int for _ in range(m+1)]
dp[0] = 0

for i in range(1, n+1):
    for j in range(m, -1, -1):
        if j >= A[i] :
            dp[j] = min(dp[j], dp[j-A[i]] + 1)

print(dp[m] if dp[m] != max_int else -1)
