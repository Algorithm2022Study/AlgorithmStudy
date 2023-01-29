def solution(babbling):
    answer = 0
    words = ["aya", "ye", "woo", "ma"]
    repeats = ["ayaaya", "yeye", "woowoo", "mama"]

    for x in babbling:
        for word in repeats:
            x = x.replace(word, "X")
        for word in words:
            x = x.replace(word, "O")

        isValid = True
        for char in x:
            if char != "O":
                isValid = False
                break
        if isValid == True:
            answer += 1

    return answer
