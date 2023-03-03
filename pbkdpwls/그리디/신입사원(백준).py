import sys

t = int(sys.stdin.readline()) # 테스트 케이스 개수

for k in range(t):
    n = int(input()) # 지원자 숫자
    arr = [0]*(n+1)
    count = 1

    for i in range(n):
        a,b = map(int,sys.stdin.readline().split())
        arr[a] = b
    pre = arr[1]

    for i in range(2,n+1):
        if(arr[i]<pre):
            count+=1
            pre = arr[i]

    print(count)