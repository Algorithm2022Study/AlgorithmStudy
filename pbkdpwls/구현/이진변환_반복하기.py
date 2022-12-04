def solution(s):
    answer = [0, 0]

    while s != "1":
        answer[0] += 1
        answer[1] += s.count("0")
        s = s.replace("0", "")
        s = format(len(s), 'b')

    return answer