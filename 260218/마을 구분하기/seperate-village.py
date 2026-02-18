import sys

# 재귀 깊이 제한을 늘려줍니다 (파이썬 기본값은 1000이라 N이 크면 에러 날 수 있음)
sys.setrecursionlimit(2000)

def in_range(x, y, n):
    return 0 <= x < n and 0 <= y < n

def dfs(x, y):
    # 방문 처리
    visited[x][y] = True
    count = 1  # 현재 위치의 사람 1명 카운트
    
    # 상하좌우 탐색
    dxs, dys = [-1, 1, 0, 0], [0, 0, -1, 1]
    
    for dx, dy in zip(dxs, dys):
        nx, ny = x + dx, y + dy
        
        # 범위 안에 있고, 사람이 있으며(1), 아직 방문하지 않았다면
        if in_range(nx, ny, n) and grid[nx][ny] == 1 and not visited[nx][ny]:
            count += dfs(nx, ny) # 재귀 호출 결과를 더해줌
            
    return count

# 입력 받기
n = int(input())
grid = [list(map(int, input().split())) for _ in range(n)]

# 방문 여부를 체크할 배열 (초기화는 여기서 한 번만!)
visited = [[False] * n for _ in range(n)]
village_sizes = []

# 격자 전체를 순회
for i in range(n):
    for j in range(n):
        # 사람이 있고(1) + 방문한 적이 없다면 -> 새로운 마을 발견!
        if grid[i][j] == 1 and not visited[i][j]:
            # DFS를 돌려 해당 마을의 사람 수를 받아옴
            size = dfs(i, j)
            village_sizes.append(size)

# 출력
village_sizes.sort() # 오름차순 정렬
print(len(village_sizes)) # 총 마을 개수

for size in village_sizes:
    print(size) # 각 마을의 사람 수