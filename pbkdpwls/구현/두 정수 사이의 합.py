def solution(a, b):
    answer = 0

    if a > b:
        a, b = b, a

    answer = sum([i for i in range(a, b + 1)])

    return answer