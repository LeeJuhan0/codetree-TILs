n = int(input())
grid = [list(map(int, input().split())) for _ in range(n)]
visited = [[0 for _ in range(n)] for _ in range(n)]
villages_size = []

def dfs(x, y):
    count = 1  
    visited[x][y] = 1
    dxs, dys = [-1,1,0,0], [0,0,1,-1]
    
    curr_x, curr_y = x, y 
    for dx, dy in zip(dxs,dys) :
        next_x, next_y = curr_x + dx, curr_y + dy
        if can_go(next_x, next_y):
            count += dfs(next_x, next_y)
            
    return count
    

def in_range(x, y):
    if x >= 0 and x < n and y >= 0 and y < n :
        return True
    return False
    
def can_go(x,y) :
    if not in_range(x,y):
        return False
    if  visited[x][y] == 1 or grid[x][y] == 0:
        return False
    return True

for i in range(n):
    for j in range(n):
        if can_go(i, j):
            size = dfs(i,j)
            villages_size.append(size)

villages_size.sort()
print(len(villages_size))
for i in villages_size:
    print(i)