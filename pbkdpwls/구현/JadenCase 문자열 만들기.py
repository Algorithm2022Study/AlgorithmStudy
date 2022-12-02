def solution(s):
    answer = ''

    arr1 = s.split(" ")

    for i in range(len(arr1)):
        answer += arr1[i][0:1].upper() + arr1[i][1:].lower() + " "

    answer = answer[:len(answer) - 1]

    return answer