n = int(input())
grid = [list(map(int, input().split())) for _ in range(n)]

# Please write your code here.

dp = [[0]*n for i in range(n)]
dp[0][0] = grid[0][0]

minv = 1000000
for i in range(1,n) :
    for j in range(1,n) :
        dp[i][j] = max(grid[i-1][j],grid[i][j-1]) 
        if dp[i][j] <= minv :
            minv = dp[i][j]
if n == 1: 
    print(grid[0][0])
else:
    print(minv)