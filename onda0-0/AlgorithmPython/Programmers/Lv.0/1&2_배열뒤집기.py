# 문제 설명
# 정수가 들어 있는 배열 num_list가 매개변수로 주어집니다. 
# num_list의 원소의 순서를 거꾸로 뒤집은 배열을 return하도록 solution 함수를 완성해주세요.

def solution(num_list):
    answer = []
    for i in num_list:
        answer.insert(0,i)
    return answer