def solution(n, lost, reserve):
    answer = 0

    lost_len = len(lost)

    for i in lost:
        if i in reserve:
            reserve.remove(i)
            lost.remove(i)
            lost_len -= 1

    for i in lost:
        if (i - 1) in reserve:
            reserve.remove(i - 1)
            lost_len -= 1

        elif (i + 1) in reserve:
            reserve.remove(i + 1)
            lost_len -= 1

    answer = n - lost_len

    return answer