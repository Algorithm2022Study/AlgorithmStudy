# 문제 설명
# 정수를 담고 있는 배열 arr의 평균값을 return하는 함수, solution을 완성해보세요.

def solution(arr):
    answer = 0
    sum=0
    for i in arr:
        sum=sum+i
    answer=sum/len(arr)
    return answer