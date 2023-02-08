import sys, math

n = int(sys.stdin.readline())
arr = []

# 처음 가로수
num = int(sys.stdin.readline())
# 간격
for i in range(n-1):
    x = int(sys.stdin.readline())
    arr.append(x-num)
    num = x

# print(arr)

# 최대공약수
a = arr[0]
for i in arr:
    a = math.gcd(a,i)

answer = 0
for i in range(n-1):
    answer += arr[i] // a -1
print(answer)






