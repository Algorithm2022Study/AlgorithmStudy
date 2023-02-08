# 전보
import heapq
import sys

input = sys.stdin.readline() # 빠르게 입력받음
INF = int(1e9) # 시작 거리 무한대

n, m, start = map(int, input().split()) # 노드, 통로, 시작점

graph = [[] for i in range(n+1)] # 연결 노드 담을 배열 초기화

distance = [INF] * (n+1) # 최단 거리 배열 무한대로 초기화

# 간선 정보 입력
for i in range(m):
    x, y, z = map(int, input().split())
    graph[x].append((y,z)) # x번 노드에서 y번 노드로 가는 비용 z

def dijkstra(start):
    q = []
    heapq.heappush(q, (0, start))
    distance[start] = 0

    while q:
        dist, now = heapq.heappop(q)
        if distance[now] < dist:
            continue
        for i in graph[now]:
            cost = dist + i[1]
            if cost < distance[i[0]]:
                distance[i[0]] = cost
                heapq.heappush(q, (cost, i[0]))

dijkstra(start)

count = 0

max_distance = 0
for d in distance:
    if d!=INF:
        count += 1
        max_distance = max(max_distance, d)

print(count - 1, max_distance)
