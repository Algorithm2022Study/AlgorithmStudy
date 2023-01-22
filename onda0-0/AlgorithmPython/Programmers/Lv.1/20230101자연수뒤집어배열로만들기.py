def solution(n):
    n = str(n)
    answer = []
    
    for i in range(1, len(n)+1):
        a = int(n[-i])
        answer.append(a)
        
    return answer