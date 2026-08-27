import sys
from collections import deque
input = sys.stdin.readline

n, k = map(int, input().split())
grid = [list(map(int, input().split())) for _ in range(n)]
r, c = map(int, input().split())
r -= 1
c -= 1

def in_range(r, c):
    if r < 0 :
        return False
    if r >= n :
        return False
    if c < 0 :
        return False
    if c >= n :
        return False
    return True

for i in range(k):
    x = grid[r][c] 
    visited = [[False] * n for _ in range(n)]
    visited[r][c] = True
    q = deque([(r,c)])
    best = None

    while q:
        cr, cc = q.popleft()
        for dr, dc in ((-1,0),(1,0),(0,-1),(0,1)) :
            nr, nc = cr + dr, cc + dc
            if in_range(nr, nc) and not visited[nr][nc] and grid[nr][nc] < x :
                visited[nr][nc] = True 
                q.append((nr,nc))
                v = grid[nr][nc]
                if best is None or v > best[0] or (v == best[0] and (nr, nc) < (best[1], best[2])):
                    best = (v, nr, nc)
    if best is None :
        break
    r, c = best[1], best[2]

print(r+ 1, c+ 1)