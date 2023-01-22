import math

# 소수 판별
def primenumber(x):
    for i in range (2, int(math.sqrt(x) + 1)):	# 2부터 x의 제곱근까지의 숫자
        if x%i==0:
            return False
    return True