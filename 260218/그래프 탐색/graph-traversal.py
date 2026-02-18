import copy
n, m = map(int, input().split())
edges = [tuple(map(int, input().split())) for _ in range(m)]

graph = [[0]*(n+1) for _ in range(n+1)]
for i in edges:
    graph[i[0]][i[1]] = 1
    graph[i[1]][i[0]] = 1

visited = [False] *(n+1)

def dfs(vertax) :
    for curr_v in range(1,n+1):
        if graph[vertax][curr_v] and not visited[curr_v] :
            visited[curr_v] = True
            dfs(curr_v)

dfs(1)
visited = copy.deepcopy(visited[2:])
print(visited.count(True))

# Please write your code here.
