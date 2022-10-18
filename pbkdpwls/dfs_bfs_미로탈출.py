from collections import deque

n, m = map(int, input().split()) # 행, 열

move = 0 # 최종 결과, 이동 개수
graph = []

for i in range(n):
    graph.append(list(map(int, input())))

# 상 하 좌 우
dx = [-1,1,0,0]
dy = [0,0,-1,1]

def bfs(x, y):
    queue = deque()
    queue.append((x, y))

    while queue:
        x, y = queue.popleft()

        for i in range(4):
            nx = x + dx[i]
            ny = y + dy[i]

            if nx <0 or ny<0 or nx>=n or ny>=m:
                continue

            if graph[nx][ny] == 0: # 괴물인 경우
                continue

            if graph[nx][ny] == 1: # 처음 방문인 경우
                graph[nx][ny] = graph[x][y] + 1 # 경로 이동 수 업데이트
                queue.append(graph[nx][ny])

    return graph[n-1][m-1]

print(bfs(0,0))



