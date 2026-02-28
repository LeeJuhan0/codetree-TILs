from collections import deque
n, m = map(int, input().split())
grid = [list(map(int, input().split())) for _ in range(n)]

def in_range(x,y) :
    if 0 <= x < n and 0 <= y < m :
        return True
    return False

def can_go(x,y) :
    if not in_range(x,y) :
        return False
    if grid[x][y] == 0 :
        return False
    return True
q = deque([[0,0]])

def bfs(q) :
    visited = [[False for _ in range(m)] for _ in range(n)]
    while q:
        xy = q.popleft()
        curr_x, curr_y = xy[0], xy[1]
        dxs, dys = [-1,0,1,0] ,[0,-1,0,1]
        for dx, dy in zip(dxs, dys):
            next_x, next_y = curr_x + dx, curr_y + dy
            if can_go(next_x, next_y) and not visited[next_x][next_y]   :
                visited[next_x][next_y] =True
                q.append([next_x, next_y])
                if grid[next_x][next_x] == 1 and  (next_x == n-1 and next_y == m-1) :
                    return 1
    return 0
print(bfs(q))
