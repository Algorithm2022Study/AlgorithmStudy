def solution(elements):
    answer = 0
    length = len(elements)
    elements = elements * 2
    arr = set()

    for i in range(length):
        for j in range(length):
            arr.add(sum(elements[j:j + i + 1]))

    answer = len(arr)

    return answer
