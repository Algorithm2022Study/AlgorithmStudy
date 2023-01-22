import collections


def solution(participant, completion):
    # 1. participant의 Counter를 구한다
    # 2. completion의 Counter를 구한다
    # 3. 둘의 차를 구하면 정답만 남아있는 counter를 반환한다
    answer = collections.Counter(participant) - collections.Counter(completion)

    # 4. counter의 key값을 반환한다
    return list(answer.keys())[0]


print(solution(["marina", "josipa", "nikola", "vinko", "filipa"]
               , ["josipa", "filipa", "marina", "nikola"]))