import sys
from collections import deque

def bfs(v):
    queue = deque([v])
    visit[v] = True

    while queue:
        temp = queue.pop()

        for i in range(n+1):
            if arr[temp][i]==1:
                if not visit[i]:
                    queue.append(i)
                    visit[i] = True

n,m = map(int, sys.stdin.readline().split())
arr = [[0 for _ in range(n+1)] for _ in range(n+1)]
visit = [False]*(n+1)
cnt = 0

for i in range(m):
    a,b = map(int, sys.stdin.readline().split())
    arr[a][b] = 1
    arr[b][a] = 1

for k in range(1, n+1):
    if visit[k]:
        continue
    bfs(k)
    cnt+=1

print(cnt)


