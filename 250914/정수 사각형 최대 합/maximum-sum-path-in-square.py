n = int(input())
grid = [list(map(int, input().split())) for _ in range(n)]

# Please write your code here.
dp = []
for i in range(n) :
    for j in range(n) :
        zero = [0] *n
    dp.append(zero)

k = 0
for i in range(n) :
    k += grid[0][i]
    dp[0][i] = k

k = 0
for i in range(n) :
    k += grid[i][0]
    dp[i][0] = k

for i in range(1,n) :
    for j in range(1,n) :
        dp[i][j] = max(dp[i-1][j] + grid[i][j], dp[i][j-1] + grid[i][j])

print(dp[n-1][n-1])