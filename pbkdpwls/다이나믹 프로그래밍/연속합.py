n = int(input())
arr = list(map(int, input().split()))
dp = [0 for i in range(n)]
dp[0] = arr[0]
minvalue = 0

for i in range(1,n):
    dp[i] = max(dp[i-1]+arr[i], arr[i]) # 이전까지의 최대값, 현재값

print(max(dp))
