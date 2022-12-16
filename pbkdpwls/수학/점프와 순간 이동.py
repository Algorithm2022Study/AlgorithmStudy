# 풀이 링크 : https://squidward-tentac1es.tistory.com/147

def solution(n):
    ans = 1  # 초기값 1 (필수)

    while n != 1:
        if n % 2 == 0:  # 짝수 - 순간이동
            n /= 2
        else:  # 홀수 - 점프 (+1)
            n -= 1
            ans += 1

    return ans