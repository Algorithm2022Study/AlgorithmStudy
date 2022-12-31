def solution(n):
    answer = int(''.join(sorted(list(str(n)), reverse=True)))

    return answer