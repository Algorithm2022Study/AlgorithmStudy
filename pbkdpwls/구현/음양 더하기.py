def solution(absolutes, signs):
    arr = []
    for i in range(len(absolutes)):
        if signs[i] == True:
            arr.append(absolutes[i])
        else:
            arr.append(-absolutes[i])

    return sum(arr)