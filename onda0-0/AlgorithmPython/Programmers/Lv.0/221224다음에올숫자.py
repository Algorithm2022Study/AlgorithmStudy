def solution(common):
    num = common[1] - common[0]    
    if common[1] + num == common[2]:
        answer = common[len(common)-1] + num
    else:
        num = common[1] // common[0]    
        answer = common[len(common)-1] * num
    return answer