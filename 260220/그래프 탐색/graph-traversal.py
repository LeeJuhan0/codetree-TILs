n, m = map(int, input().split())
edges = [tuple(map(int, input().split())) for _ in range(m)]

graph = [[0 for _ in range(n+1)] for _ in range(n+1)]
visited = [False for _ in range(n+1)]

for i in edges :
    graph[i[0]][i[1]] = 1
    graph[i[1]][i[0]] = 1
cnt = 0
def dfs(vertex) :
    global cnt
    visited[vertex] = True
    for curr_v in range(1,n+1):
        if graph[vertex][curr_v] and not visited[curr_v] :
            visited[curr_v] = True
            cnt += 1
            dfs(curr_v)

dfs(1)
print(cnt)