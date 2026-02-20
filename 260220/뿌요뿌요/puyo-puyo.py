n = int(input())
grid = [list(map(int, input().split())) for _ in range(n)]
visited = [[0 for _ in range(n)] for _ in range(n)]
villages_size = []

def in_range(x,y):
    if 0 <= x < n and 0 <= y < n:
        return True
    return False

def can_go(x,y,grid_value):
    if not in_range(x,y) :
        return False
    if visited[x][y] == 1 or grid[x][y] != grid_value :
        return False
    return True

def dfs(x,y) :
    count = 1
    visited[x][y] = 1
    grid_value = grid[x][y]
    dxs, dys = [-1,1,0,0] , [0,0,-1,1]
    for dx, dy in zip(dxs, dys):
        next_x, next_y = x + dx, y + dy
        if can_go(next_x, next_y, grid_value): 
            count  += dfs(next_x, next_y)
    
    return count

for x in range(n):
    for y in range(n):
        grid_value = grid[x][y]
        if can_go(x, y, grid_value) :
            size = dfs(x,y)
            villages_size.append(size)

bomb = 0
for i in villages_size :
    if i >= 4 :
        bomb += 1

print(bomb, max(villages_size))
    