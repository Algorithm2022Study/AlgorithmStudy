import sys

n = int(sys.stdin.readline()) # 지도의 크기 (정사각형)
visited =[[0 for _ in range(n)] for _ in range(n)] # 방문 확인
arr = [] # 2차원 배열, 집 정보
answer = [] # 단지 별 집 수
count = 0 # 단지 수

def dfs(i,j):
    if visited[i][j] == 0:
        visited[i][j] = 1
        if arr[i][j]=='1':
            answer[count]+=1
            # 상
            if (i - 1 >= 0):
                if visited[i-1][j] == 0:
                    dfs(i - 1, j)
            # 하
            if (i + 1 < n):
                if visited[i+1][j] == 0:
                    dfs(i + 1, j)
            # 좌
            if (j - 1 >= 0):
                if visited[i][j-1] == 0:
                    dfs(i, j - 1)
            # 우
            if (j + 1 < n):
                if visited[i][j+1] == 0:
                    dfs(i, j + 1)

for i in range(n):
    arr.append(list(sys.stdin.readline()))

for i in range(n):
    for j in range(n):
        if (visited[i][j]==0 and arr[i][j]=='1'):
            answer.append(0)
            dfs(i,j)
            count+=1

print(count)
answer = sorted(answer)
for i in answer:
    print(i)