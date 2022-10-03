# 선분 위의 점
def find(n, points, target):
    start, end = 0, n - 1
    while start < end:
        mid = (start + end) // 2
        if target < points[mid]:
            end = mid - 1
        elif target > points[mid]:
            start = mid + 1
        else:
            return mid
    return start

n, m = sorted(map(int, input().split()))
points = sorted(map(int, input().split()))

for _ in range(m):
    s, e = map(int, input().split())

    result = find(n, points, s)
    si = result if points[result] >= s else result + 1

    result = find(n, points, e)
    ei = result if points[result] <= e else result - 1

    print(ei - si + 1)