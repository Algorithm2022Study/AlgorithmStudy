def solution(n):
    answer = 0
    sum = 0
    
    for i in range(1, n+1):
        if n % i == 0:
            sum += i
            answer = sum
    
    return answer