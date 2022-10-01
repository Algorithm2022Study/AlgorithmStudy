def binary_search(target, data):
    start = 0
    end = len(data) - 1

    while start <= end:
        mid = (start + end) // 2

        if data[mid] == target:
            return mid  # 함수를 끝내버린다.
        elif data[mid] < target:
            start = mid + 1
        else:
            end = mid - 1

    return None


n, m = map(int, input().split())

nArray = []
mArray = []
count = 0

for i in range(n):
    a = int(input())
    if a == 0:
        break
    nArray.append(a)

for i in range(m):
    b = int(input())
    if b == 0:
        break
    mArray.append(b)

for i in range(m):
    if (binary_search(mArray[i], nArray) != None):
        count += 1
print(count)