def solution(n):
    answer = 1
    sum_ = 0

    for j in range(n):
        for i in range(j + 1, n):
            sum_ += i
            if sum_ == n:
                answer += 1
                sum_ = 0
                break
            if sum_ > n:
                sum_ = 0
                break

    return answer
