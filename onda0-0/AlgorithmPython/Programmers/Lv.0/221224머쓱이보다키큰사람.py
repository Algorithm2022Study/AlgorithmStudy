def solution(array, height):
    array.append(height)
    array.sort()
    answer = len(array) - array.index(height) - array.count(height)
    return answer