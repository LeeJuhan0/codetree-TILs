import sys
sys.setrecursionlimit(3000)

n, m = map(int, input().split())
grid = [list(map(int, input().split())) for _ in range(n)]
section_by_k = []

def can_go(x,y,k):
    if not in_range(x,y):
        return False
    if visited[x][y] == 1 or grid[x][y] <= k :
        return False 
    return True

def in_range(x,y):
    if 0 <= x and x < n and 0 <= y and y < m:
        return True
    return False

def dfs(x,y,k):
    visited[x][y] = 1
    dxs, dys = [-1,1,0,0], [0,0,-1,1]
    for dx, dy in zip(dxs, dys):
        next_x, next_y = x + dx, y + dy
        if can_go(next_x, next_y, k) :
            dfs(next_x, next_y, k)
    return 1


for k in range(1,max(map(max, grid))):
    visited = [[0 for _ in range(m)] for _ in range(n)]
    cnt = 0
    for x in range(n):
        for y in range(m):
            if can_go(x,y,k):
                cnt += dfs(x,y,k)
    section_by_k.append([k,cnt])

section_by_k.sort(key = lambda x:(x[1], -x[0]))
nothing = [1,0]
try :
    print(*section_by_k[-1])
except :
    print(*nothing)
