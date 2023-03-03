# 풀이주소: https://squidward-tentac1es.tistory.com/81
import sys

sys.setrecursionlimit(10 ** 6)  # 재귀 허용 깊이를 수동으로 늘려줌

# dfs 탐색
def dfs(x, y):
    if x <= -1 or x >= M or y <= -1 or y >= N:
        return False

    if graph[x][y] == 1:  # 탐색하지 않았으면 탐색
        # 탐색했으면 0
        graph[x][y] = 0
        # 상,하,좌,우,대각선을 재귀적으로 탐색
        dfs(x + 1, y)  # 오른쪽
        dfs(x + 1, y + 1)  # 오른쪽 위 대각선
        dfs(x + 1, y - 1)  # 오른쪽 아래 대각선

        dfs(x - 1, y)  # 왼쪽
        dfs(x - 1, y + 1)  # 왼쪽 위 대각선
        dfs(x - 1, y - 1)  # 왼쪽 아래 대각선

        dfs(x, y + 1)  # 위
        dfs(x, y - 1)  # 아래

        return True
    return False


M, N = map(int, sys.stdin.readline().split())
graph = [list(map(int, sys.stdin.readline().split())) for _ in range(M)]

count = 0  # 글자 개수

for i in range(M):
    for j in range(N):
        if graph[i][j] == 1:
            dfs(i, j)

            # 글자 개수 카운트
            count += 1
print(count)