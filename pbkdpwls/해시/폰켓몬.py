from collections import Counter

def solution(nums):
    dic = Counter(nums)
    answer = len(nums) // 2 if len(dic) >= len(nums) // 2 else len(dic)

    return answer