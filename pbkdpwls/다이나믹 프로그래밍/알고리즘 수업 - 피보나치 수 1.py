def fib(n):
    global answer2
    for i in range(3, n+1):
        fi[i] = fi[i-1]+fi[i-2]
        answer2 += 1
    return fi[n]

n = int(input())
fi = [1]*(n+1)
answer2 = 0

# 재귀함수의 호출 횟수는 피보나치 수와 같다.
answer1 = fib(n)

print(answer1, answer2)