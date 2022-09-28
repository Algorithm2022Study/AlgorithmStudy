# 문제풀이 주소
# https://squidward-tentac1es.tistory.com/89

from collections import defaultdict

score = [0, 3, 2, 1, 0, 1, 2, 3]


def solution(survey, choices):
    answer = ''
    surv = defaultdict(int)

    for i in range(len(survey)):
        surv[survey[i][choices[i] // 4]] += score[choices[i]]

    answer += 'R' if surv['R'] >= surv['T'] else 'T'
    answer += 'C' if surv['C'] >= surv['F'] else 'F'
    answer += 'J' if surv['J'] >= surv['M'] else 'M'
    answer += 'A' if surv['A'] >= surv['N'] else 'N'

    return answer