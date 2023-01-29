import heapq

def solution(scoville, K):
    answer = 0
    heapq.heapify(scoville)

    while (scoville[0] < K): # min 함수를 사용했더니 시간초과
        if len(scoville) <= 1:
            return -1
        a = heapq.heappop(scoville)
        b = heapq.heappop(scoville)
        s = a + b * 2
        heapq.heappush(scoville, s)
        answer += 1

    return answer