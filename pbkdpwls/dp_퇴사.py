N = int(input())
li = [list(map(int, input().split())) for _ in range(N)]
dp = [0 for _ in range(N + 1)]

for i in range(N - 1, -1, -1):
    if i + li[i][0] > N:
        dp[i] = dp[i + 1]
    else:
        dp[i] = max(dp[i + 1], li[i][1] + dp[i + li[i][0]])  # 바로 전단계 DB vs 현재 i 값 + (현재 일자 + 소요 일자) > 이 인덱스의 최대값, 가장 전값에 현재값 더하는게 아니라, 소요 일자를 넣어서 계산해야함

print(dp[0])