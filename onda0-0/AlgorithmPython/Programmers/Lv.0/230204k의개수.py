def solution(i: int, j: int, k: int) -> int:
    answer = 0

    for x in range(i, j + 1):
        answer += sum([1 for x in list(str(x)) if x == str(k)])

    return answer