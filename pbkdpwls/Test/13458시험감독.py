N = int(input()) # 시험장의 개수
A = list(map(int,input().split())) # 각 시험장에 있는 응시자 수
B, C = map(int, input().split())
result = 0

# 감독관의 최소 수 구하기
for i in range(N):
    if A[i]<=B:
        result+=1
        continue
    A[i] -= B
    result+=1
    if A[i]<=C:
        result+=1
    elif A[i]%C==0: # 나머지가 없을 때
        result += (A[i]//C)
    else:
        result += (A[i]//C)+1
print(result)