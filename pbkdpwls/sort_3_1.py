import sys

n = int(input())  # 단어의 개수 n 입력
temp = []

for i in range(n):
    temp.append(sys.stdin.readline().strip())

tempSet = set(temp)  # 중복 제거
temp = list(tempSet)

temp.sort()
temp.sort(key=len)

for i in temp:
    print(i)