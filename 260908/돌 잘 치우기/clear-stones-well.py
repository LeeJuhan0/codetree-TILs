from collections import deque
from itertools import combinations

n, k, m = map(int, input().split())

grid = [list(map(int, input().split())) for _ in range(n)]

r = []
c = []
for _ in range(k):
    ri, ci = map(int, input().split())
    r.append(ri - 1)
    c.append(ci - 1)

def in_range(x, y):
    if x < 0 or x >= n:
        return False
    if y < 0 or y >= n:
        return False
    return True

def can_go(x, y, grid):
    if not in_range(x, y):
        return False
    if grid[x][y] == 1:
        return False
    return True

def bfs(grid):
    visited = [[False for _ in range(n)] for _ in range(n)]
    q = deque()
    num = 0
    for x, y in zip(r, c):
        if grid[x][y] == 0 :
            q.append((x, y))
            visited[x][y] = True
            num += 1
    while q:
        curr_x, curr_y = q.popleft()
        dx, dy = [1, 0, -1, 0], [0, 1, 0, -1]
        for dxs, dys in zip(dx, dy):
            next_x, next_y = curr_x + dxs, curr_y + dys
            if can_go(next_x, next_y, grid) and not visited[next_x][next_y]:
                visited[next_x][next_y] = True
                q.append((next_x, next_y))
                num += 1
    return num

# 벽 좌표 전부 수집
walls = []
for i in range(n):
    for j in range(n):
        if grid[i][j] == 1:
            walls.append((i, j))

max_num = 0

for removed in combinations(walls, m):
    for x, y in removed:
        grid[x][y] = 0

    curr_num = bfs(grid)
    if max_num < curr_num:
        max_num = curr_num

    for x, y in removed:
        grid[x][y] = 1

print(max_num)