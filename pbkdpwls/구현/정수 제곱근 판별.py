def solution(n):
    answer = -1

    if n == 1:
        return 4

    for i in range(1, n // 2):
        if (n % i == 0):
            if (i * i == n):
                answer = (i + 1) * (i + 1)
                return answer

    return answer