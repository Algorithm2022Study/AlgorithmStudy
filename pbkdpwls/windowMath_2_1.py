# 문제 풀이 주소
# https://squidward-tentac1es.tistory.com/84

# 어떤 수 n이 x의 제곱이라면 n의 약수의 개수는 x를 기준으로 왼쪽,
# 오른쪽의 약수는 서로 대응되어 짝수개이지만 x는 x자신과 대응되므로 한 개이다. 결국 홀수개가 된다.
# 문제는 1부터 n까지의 수 중에서 완전 제곱수의 개수를 구하는 문제이다.

import math

n = int(input())
print(math.floor(math.sqrt(n)))