import sys
from itertools import permutations

input = sys.stdin.readline
N = int(input())
num = list(map(int, input().split()))
op_num = list(map(int, input().split()))  # +, -, *, /
op_list = ['+', '-', '*', '/']
op = []

for k in range(len(op_num)):
    for i in range(op_num[k]):
        op.append(op_list[k])

maximum = -1e9
minimum = 1e9


def solve():
    global maximum, minimum
    for case in permutations(op, N - 1):
        total = num[0]
        for r in range(1, N):
            if case[r - 1] == '+':
                total += num[r]
            elif case[r - 1] == '-':
                total -= num[r]
            elif case[r - 1] == '*':
                total *= num[r]
            elif case[r - 1] == '/':
                total = int(total / num[r])

        if total > maximum:
            maximum = total
        if total < minimum:
            minimum = total


solve()
print(maximum)
print(minimum)