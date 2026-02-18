n = int(input())
grid = [list(map(int, input().split())) for _ in range(n)]
answer = [[0]*n for _ in range(n)]
order = 1
village = []
village_sizes = []

def marking_omr(n) :
    global visited
    visited = [[0]*n for _ in range(n)]
    for x in range(n):
        for y in range(n):
            global order
            order = 1
            size = dfs(x, y)
            if size == 1:
                continue
            village_sizes.append(size)
        
def dfs(x, y) :
    global order
    count = 1
    dxs, dys = [1,0,-1,0],[0,1,0,-1] 
    for dx, dy in zip(dxs, dys) :
        new_x, new_y = x + dx, y + dy

        if can_go(new_x, new_y) :
            answer[new_x][new_y] = max(order, answer[new_x][new_y])
            order += 1
            visited[new_x][new_y] = 1
            count += dfs(new_x, new_y) 
    return count 

def can_go(x, y) :
    if not in_range(x,y):
        return False
    if visited[x][y] or grid[x][y] == 0:
        return False
    return True
    
def in_range(x,y):
    if 0 <= x and x < n and 0 <= y and y < n :
        return True
    else :
        return False

marking_omr(n)

village_sizes.sort() 
print(len(village_sizes)) 

for size in village_sizes:
    print(size-1) 