def solution(X, Y):
    answer = []
    xDict = dict()
    yDict = dict()

    # xDict 생성
    for x in X:
        xDict[x] = xDict.get(x, 0) + 1

    # yDict 생성
    for y in Y:
        yDict[y] = yDict.get(y, 0) + 1

    # xDict의 key를 기준으로 탐색해서, 짝꿍이 있다면, xDict와yDict에서 -1 해주고 answer에 추가
    for k, v in xDict.items():
        if k in yDict.keys():
            while yDict[k] > 0 and xDict[k] > 0:
                answer.append(k)
                yDict[k] = yDict.get(k) - 1
                xDict[k] = xDict.get(k) - 1

    # 아무것도 없는 경우 return -1
    if (len(answer) == 0):                 return "-1"

    # answer에 0들밖에 없을 경우 return 0
    if (answer.count('0') == len(answer)): return "0"

    answer.sort(reverse=True)

    return ''.join(answer)