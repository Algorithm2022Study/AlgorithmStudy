def solution(my_string, n):
    answer = ''
    lili=list(my_string)
    for i in lili:
        answer=answer+i*n
    return answer