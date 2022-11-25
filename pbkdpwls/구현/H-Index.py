def solution(citations):
    answer = 0

    # h번 이상 인용된게 h편 이상.
    # h편 이상의 논문이 h번 이상 인용
    for i in range(len(citations) + 1, 0, -1):  # h편
        count = 0
        for j in citations:
            if (i <= j):
                count += 1
        if (count >= i):
            return i

    return answer