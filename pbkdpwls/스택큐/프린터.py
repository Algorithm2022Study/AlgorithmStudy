from collections import deque


def solution(priorities, location):
    answer = 0
    que = deque(priorities)

    while que:
        for i in range(len(priorities)):
            tempMax = max(que)
            add = que.popleft()
            if tempMax == add:
                que.append(0)
                answer += 1
                if i == location:
                    return answer
            else:
                que.append(add)

    return answer