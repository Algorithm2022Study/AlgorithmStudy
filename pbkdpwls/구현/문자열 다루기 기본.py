def solution(s):
    answer = False

    for i in s:
        if i.isalpha():
            return False

    if len(s) == 4 or len(s) == 6:
        return True

    return answer