# 이전에 만든 수에서 1,2,3을 각각을 더했을 때 현재의 수가 나오므로
# 1을 더했을 때, 2를 더했을 때, 3을 더했을 때 현재의 수가 나오는. 각각의 이전 조합의 경우의 수를 더하기
import sys

T = int(sys.stdin.readline())

for i in range(T):
    n = int(input())
    arr = [1, 2, 4] + [0] * (n - 3)

    for j in range(3, n):
        arr[j] = arr[j - 1] + arr[j - 2] + arr[j - 3]

    print(arr[n - 1])







