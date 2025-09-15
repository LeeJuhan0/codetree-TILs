n = int(input())
grid = [list(map(int, input().split())) for _ in range(n)]

# Please write your code here.

dp = [[0]*n for i in range(n)]
dp[0][0] = grid[0][0]

minv = dp[0][0]
for i in range(1,n) :
    for j in range(1,n) :
        dp[i][j] = max(grid[i-1][j],grid[i][j-1]) 
        if dp[i][j] <= minv :
            minv = dp[i][j]

if grid[i][j] <= minv :
        minv = grid[i][j]

print(minv)