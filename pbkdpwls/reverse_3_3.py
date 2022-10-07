# 문제풀이 링크
# https://squidward-tentac1es.tistory.com/95

while(True):
    n = list(map(int, input()))
    if n==[0]:
        break
    else:
        if n==list(reversed(n)):
            print("yes")
        else:
            print("no")