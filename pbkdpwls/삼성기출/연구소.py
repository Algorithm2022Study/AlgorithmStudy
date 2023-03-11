import sys, copy
from collections import deque
from itertools import combinations

def bfs():
    queue = deque()
    temp_graph = copy.deepcopy(arr)
    for i in range(n):
        for j in range(m):
            if temp_graph[i][j]==2:
                queue.append((i,j))

    while queue:
        x, y = queue.popleft()

        for i in range(4):
            nx = x + dxy[i][0]
            ny = y + dxy[i][1]

            if nx < 0 or nx >= n or ny <0 or ny >=m:
                continue
            if temp_graph[nx][ny]==0:
                temp_graph[nx][ny]=2
                queue.append((nx,ny))
    global answer
    cnt = 0

    for i in range(n):
        cnt += temp_graph[i].count(0)
    answer = max(answer, cnt)

def makeWall(cnt):
    if cnt==3:
        bfs()
        return
    for i in range(n):
        for j in range(m):
            if arr[i][j] == 0:
                arr[i][j] = 1
                makeWall(cnt+1)
                arr[i][j] = 0

def solve():
    global answer
    # 추가할 3개의 벽 모든 조합
    for new_wall in combinations(empty, num_wall):
        temp_graph = copy.deepcopy(arr)
        for a, b in new_wall:
            temp_graph[a][b] = 1
        # 바이러스 위치 정보를 리스트에 저장
        virus = [(c,d) for c in range(n) for d in range(m) if temp_graph[c][d]==2]
        while virus:
            x,y = virus.pop()
            for dx, dy in dxy:
                nx = x+dx
                ny = y+dy

                if 0 <= nx < n and 0 <= ny < m and temp_graph[nx][ny]==0:
                    temp_graph[nx][ny] = 2
                    virus.append((nx,ny))

        # 안전한 위치 카운트
        safez_cnt = 0
        for row in temp_graph:
            safez_cnt += row.count(0)
        answer = max(answer, safez_cnt)

n,m = map(int, sys.stdin.readline().split())
num_wall = 3
# 2차원 배열
arr = [list(map(int, sys.stdin.readline().split())) for _ in range(n)]
# 벽을 세울 수 있는 빈 공간 정보를 리스트에 저장
empty = [(a, b) for a in range(n) for b in range(m) if arr[a][b] == 0]
# 상 하 좌 우
dxy = [(-1, 0), (1, 0), (0, -1), (0, 1)]
answer = 0
# makeWall(0)
solve()
print(answer)


