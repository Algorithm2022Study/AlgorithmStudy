def solution(x, n):
    answer = []

    if x == 0:
        return [0 for i in range(n)]

    if x >= 0:
        fin = x * n + 1
    else:
        fin = x * n - 1

    for i in range(x, fin, x):
        answer.append(i)

    return answer