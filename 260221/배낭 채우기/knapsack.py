import sys

N, M = map(int, input().split())
w, v = zip(*[tuple(map(int, input().split())) for _ in range(N)])
w, v = [0] + list(w), [0]+list(v)

int_min = -sys.maxsize
dp = [[int_min for _ in range(M+1)] for _ in range(N+1)]
dp[0][0] = 0

for r in range(1,N+1) :
    for c in range(0,M+1) :
        if c >= w[r] :
            dp[r][c] = max(dp[r-1][c-w[r]] + v[r], dp[r-1][c])
        else :
            dp[r][c] = dp[r - 1][c]

ans = 0
for i in range(M+1) :
    ans = max(ans, dp[N][i])

print(ans)