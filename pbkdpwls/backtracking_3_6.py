# https://squidward-tentac1es.tistory.com/103

n, m = map(int, input().split())
arr = [] # 프린트 할 결과 배열

def btrack():
    if len(arr) == m: # 배열 길이 초과하면 프린트하고, return 종료
        print(" ".join(map(str,arr)))
        return
    else:
        for i in range(1,n+1): # 1 ~ n까지 반복문 실행
            if i not in arr: # 중복되지 않으면
                arr.append(i) # 추가
                btrack() # 재귀로 호출해서 중복되지 않으면 추가, 아니면 지금까지 배열 프린트
                arr.pop() # 재귀 끝나면 여기로 돌아옴. 백트랙 > 이전 다시 탐색
btrack()