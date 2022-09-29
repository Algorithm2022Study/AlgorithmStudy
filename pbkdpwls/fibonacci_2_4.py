# 문제 풀이 블로그
# https://squidward-tentac1es.tistory.com/90

def solution(num):
    a,b = 0,1
    for i in range(num):
        a,b = b,a+b
    return a