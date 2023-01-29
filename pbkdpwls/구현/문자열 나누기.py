def solution(s):
    answer = 0
    t = ["", 0, 0]
    for i in s:
        if t[0] == "":
            t[0] = i
            t[1] += 1
        else :
            if t[0] == i:
                t[1] += 1
            else :
                t[2] += 1
            if t[1] == t[2]:
                answer += 1
                t = ["", 0, 0]
    if t != ["", 0, 0]:
        answer += 1
    return answer