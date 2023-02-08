# 문제풀이 블로그 링크
# https://squidward-tentac1es.tistory.com/79

def solution(arr1, arr2):
    answer = []
    sum = 0
    temp = []

    # 행렬곱 결과 배열은 N(arr1의 행)*M(arr2의 열)이다.
    for i in range(len(arr1)):
        for k in range(len(arr2[0])):
            for j in range(len(arr2)):
                sum = sum + arr1[i][j] * arr2[j][k]
            temp.append(sum)
            sum=0
        answer.append(temp)
        temp = []
    return answer