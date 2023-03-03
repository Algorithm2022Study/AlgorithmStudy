import sys
sys.setrecursionlimit(100000)

n = int(sys.stdin.readline())
answer = []
len_arr = []

for i in range(n):
    len_arr.append(list(map(int, sys.stdin.readline().split(' '))))

def dfs(i,j,k):
    if visited[i][j]==0:
        visited[i][j] = 1
        if len_arr[i][j] > k:
            # 상
            if i - 1 >= 0:
                dfs(i - 1, j, k)
            # 하
            if i + 1 < n:
                dfs(i + 1, j, k)
            # 좌
            if j - 1 >= 0:
                dfs(i, j - 1, k)
            # 우
            if j + 1 < n:
                dfs(i, j + 1, k)


turn_max = max(map(max, len_arr))

for k in range(turn_max):
    count = 0
    visited = [[0 for _ in range(n)] for _ in range(n)]
    for i in range(n):
        for j in range(n):
            if visited[i][j] == 0 and len_arr[i][j] > k:
                dfs(i, j, k)
                count+=1
    answer.append(count)

print(max(answer))

