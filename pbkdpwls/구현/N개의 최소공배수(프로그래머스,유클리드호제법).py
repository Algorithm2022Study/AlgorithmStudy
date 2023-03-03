def solution(arr):
    answer = 0
    arr1 = sorted(arr)
    answer = arr1[len(arr1) - 1]
    check = 0

    while True:
        for i in range(len(arr1)):
            if ((answer % arr1[i]) != 0):
                check = 1
        if (check == 0):
            break
        check = 0
        answer += arr1[len(arr1) - 1]

    return answer