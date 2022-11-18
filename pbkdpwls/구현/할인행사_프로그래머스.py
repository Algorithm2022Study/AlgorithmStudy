def solution(want, number, discount):
    answer = 0
    check = 1
    want_test = []

    # 각 개수(number 배열) 반영한 새로운 배열 생성
    for i in range(len(number)):
        for j in range(number[i]):
            want_test.append(want[i])

    # 첫째날부터 가능한 마지막날까지 반복
    for i in range(len(discount) - sum(number) + 1):
        check = 1
        if len(discount) > sum(number) + i:
            discount_test = discount[i:sum(number) + i].copy()
        else:
            discount_test = discount[i:].copy()

        # 해당 물건 포함 시 삭제
        for j in range(sum(number)):
            if (want_test[j] in discount_test):
                discount_test.remove(want_test[j])
            else:
                check = 0
                break

        if check == 1:
            answer += 1

    return answer