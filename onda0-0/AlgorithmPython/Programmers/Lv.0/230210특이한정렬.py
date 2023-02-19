def solution(numlist: list, n: int) -> list:
    return sorted(numlist, key=lambda x: (abs(n-x), -x))