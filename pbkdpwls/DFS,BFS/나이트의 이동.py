import sys
from collections import deque

def bfs():
    queue = deque()
    queue.append((nx,ny))
    visited[nx][ny] = 1

    while queue:
        preX, preY = queue.popleft()

        if preX==mx and preY==my:
            print(visited[preX][preY]-1)

        for x,y in dxy:
            dx, dy = preX + x, preY + y
            if (0 <= dx < num) and (0 <= dy < num) and (visited[dx][dy] == 0):
                queue.append((dx,dy))
                visited[dx][dy]=visited[preX][preY] + 1

dxy = [(1,2),(2,1),(-1,-2),(-2,-1),(1,-2),(-1,2),(-2,1),(2,-1)]

n = int(input())
for i in range(n):
    num = int(input())
    visited = [[0 for _ in range(num)] for _ in range(num)]
    nx, ny = map(int, sys.stdin.readline().split())
    mx, my = map(int, sys.stdin.readline().split())
    bfs()