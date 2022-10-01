# https://squidward-tentac1es.tistory.com/91

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


answer = ""

n = int(input())
arrayN = list(map(int, input().split()))
m = int(input())
arrayM = list(map(int, input().split()))

arrayN.sort()

for i in range(len(arrayM)):
    if (binary_search(arrayM[i], arrayN) != None):
        answer += "1 "
    else:
        answer += "0 "

print(answer)