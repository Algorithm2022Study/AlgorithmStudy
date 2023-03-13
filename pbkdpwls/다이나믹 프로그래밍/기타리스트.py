N, S, M = map(int, input().split()) # 곡의 개수, 시작 볼륨, 가능한 볼륨의 최대값
vol = list(map(int, input().split())) # 볼륨의 차이
dp = [[False for _ in range(M+1)] for _ in range(N+1)]
answer = -1
dp[0][S] = True

for i in range(N):
    for j in range(M+1):
        if (dp[i][j]==False):
            continue
        if (j-vol[i]>=0):
            dp[i+1][j-vol[i]] = True
        if (j+vol[i]<=M):
            dp[i+1][j+vol[i]] = True

for i in range(M+1):
    if dp[N][i]==True:
        answer = i

print(answer)