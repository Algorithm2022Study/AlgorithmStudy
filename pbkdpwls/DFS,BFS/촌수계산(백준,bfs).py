# 블로그 문제 풀이 주소
# https://squidward-tentac1es.tistory.com/97

from collections import deque

def bfs(s):  # s = 루트 노드
    queue = deque([s])  # BFS라 큐에 넣음, deque 사용
    visited[s] = True  # 방문 처리

    while queue:  # 방문 노드 하나씩 처리
        v = queue.popleft()  # 방문할 노드 꺼냄

        for i in graph[v]:  # 연결된 노드들 반복문으로 전부 처리
            if not visited[i]:  # 방문하지 않았으면
                queue.append(i)  # 큐에 넣고
                count[i] = count[v] + 1  # 시작노드로부터 떨어진 깊이 (자기 부모 깊이 + 1)
                visited[i] = True  # 방문 처리


n = int(input())  # 전체 사람 수
a, b = map(int, input().split())  # 촌수 계산할 두 사람 번호
m = int(input())  # 관계 개수

graph = [[] for _ in range(n + 1)]
visited = [False] * (n + 1)
count = [0] * (n + 1)  # 촌수 0으로 초기화

for _ in range(m):
    c, d = map(int, input().split())
    graph[c].append(d)
    graph[d].append(c)

bfs(a)
if count[b] > 0:
    print(count[b])
else:
    print(-1)