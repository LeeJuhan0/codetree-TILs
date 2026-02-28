from collections import deque
n, k = map(int, input().split())
grid = [list(map(int, input().split())) for _ in range(n)]
points = [tuple(map(int, input().split())) for _ in range(k)]

def in_range(x,y):
    if 0 <= x < n and 0 <= y < n :
        return True
    return False

def can_go(x,y):
    if not in_range(x,y) :
        return False
    if grid[x][y] == 1:
        return False
    return True

def bfs(q):
    global visited
    cnt = 0
    while q :
        dxs, dys = [-1,0,1,0], [0,1,0,-1]
        xy = q.popleft()
        curr_x, curr_y = xy[0], xy[1]
        for dx, dy in zip(dxs, dys) :
            next_x, next_y = curr_x + dx, curr_y + dy
            if can_go(next_x, next_y) and not visited[next_x][next_y] :
                visited[next_x][next_y] = True
                cnt += 1
                q.append([next_x, next_y])  
    return cnt

    

visited = [[False for _ in range(n)] for _ in range(n)]
answer = 0
for point in points  :
    q = deque([[point[0]-1, point[1]-1]])
    answer += bfs(q)
print(answer)