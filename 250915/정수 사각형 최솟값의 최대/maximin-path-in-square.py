n = int(input())
grid = [list(map(int, input().split())) for _ in range(n)]

# Please write your code here.

dp = [[0]*n for i in range(n)]
dp[0][0] = grid[0][0]


for i in range(n) :
    dp[i][0] = grid[i][0]
    dp[0][i] = grid[0][i]

for i in range(1,n) :
    for j in range(1,n) :
        dp[i][j] = min(dp[i-1][j],dp[i][j-1])

print(min(max(dp[n-2][n-1],dp[n-1][n-2]),grid[n-1][n-1],grid[0][0]))
