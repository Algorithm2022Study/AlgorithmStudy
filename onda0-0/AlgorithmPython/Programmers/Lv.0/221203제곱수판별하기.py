import math

def solution(n):
    answer = 0
    if math.sqrt(n)==int(math.sqrt(n)):
        answer=1
    else:
        answer=2
    return answer