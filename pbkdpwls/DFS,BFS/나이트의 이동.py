import sys
from collections import deque

def bfs(nx, ny, mx, my):
    queue = deque()
    queue.append((nx,ny))
    visited[nx][ny] = 1

    while queue:
        a,b = queue.popleft()

        if a==mx and b==my:
            print(visited[a][b]-1)

        # 이동 좌표 모두 적용
        for i,j in dxy:
            tx = a + i
            ty = b + j

            # 범위 내에 있고, 방문하기 전이라면
            if (0<=tx<num) and (0<=ty<num) and not visited[tx][ty]:
                queue.append((tx,ty))
                visited[tx][ty] = visited[a][b] + 1

# 한번에 이동 가능한 좌표
dxy = [(1,2),(2,1),(-1,-2),(-2,-1),(-1,2),(1,-2),(-2,1),(2,-1)]
# 테스트 케이스 수
n = int(sys.stdin.readline())

for i in range(n):
    num = int(sys.stdin.readline())
    visited = [[0 for _ in range(num)] for _ in range(num)]
    nx, ny = map(int, input().split()) # 현재 위치
    mx, my = map(int, input().split()) # 목표 위치
    bfs(nx, ny, mx, my)
