from collections import Counter


def solution(k, tangerine):
    answer = 0

    dic1 = dict(sorted(Counter(tangerine).items(), key=lambda x: x[1], reverse=True))

    count = 0
    for i in dic1.values():
        if (count >= k):
            break
        count += i
        answer += 1
    return answer