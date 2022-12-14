from itertools import combinations

def solution(number):
    answer = 0

    arr = list(combinations(number, 3))

    for i in arr:
        if sum(i) == 0:
            answer += 1

    return answer