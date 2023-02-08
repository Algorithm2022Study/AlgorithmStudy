# 블로그 문제 풀이 링크
# https://squidward-tentac1es.tistory.com/80

def solution(x):
    arr = list(str(x))
    sum_ = 0

    for i in range(len(arr)):
        sum_ += int(arr[i])
        if x % sum_ == 0:
            answer = True
        else:
            answer = False

    return answer