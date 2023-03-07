def dfs(r, c, d):
    global answer
    # 현재 위치 청소
    if arr[r][c]==0:
        arr[r][c] = 2
        answer+=1

    left = d
    for _ in range(4):
        left = (left+3)%4
        x, y = r+dxy[left][0], c+dxy[left][1]

        if (x>=0 and x<n and y>=0 and y<=m):
            if arr[x][y] == 0:
                dfs(x,y,left)
                return

    bx, by = r - dxy[left][0], c - dxy[left][1]

    if arr[bx][by] != 1:
        dfs(bx, by, left)

n,m = map(int, input().split())
r,c,d = map(int, input().split()) # 좌표,방향
arr = [list(map(int, input().split())) for _ in range(n)]
answer = 0
# 북 동 남 서
dxy = [(-1, 0), (0, 1), (1, 0), (0, -1)]

dfs(r,c,d)
print(answer)