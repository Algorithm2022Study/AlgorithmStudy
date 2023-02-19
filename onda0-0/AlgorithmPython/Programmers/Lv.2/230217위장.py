def solution(clothes):
    closet = {}
    answer = 1
    
    # 같은 종류의 옷끼리 묶어서 사전에 저장
    for cloth in clothes:
        if cloth[1] in closet.keys():
            closet[cloth[1]].append(cloth[0])
        else:
            closet[cloth[1]] = [cloth[0]]
    
    # 경우의 수 구하기            
    for value in closet.values():
        answer *= len(value) + 1
    
    # 아무것도 입지 않은 경우 하나 제외
    return answer-1