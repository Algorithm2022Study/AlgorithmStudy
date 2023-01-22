def solution(s, n):
    low = "abcdefghijklmnopqrstuvwxyz" # 소문자. 인덱스는 0에서 25
    up = "ABCDEFGHIJKLMNOPQRSTUVWXYZ"
    answer = ''
    for char in s:
        if char in low:
            ind = low.find(char)+n # low 문자열에서 찾은 해당 알파벳 인덱스 + n
            answer += low[ind%26] # 26으로 나눈 나머지를 사용할 경우 25를 초과하는 경우도 활용 가능
        elif char in up:
            ind = up.find(char)+n
            answer += up[ind%26]
        else: # 공백일 경우도 고려
            answer += " "
    return answer
     
solution("a B z E", 4) # 'e F d I'