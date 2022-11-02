import sys
input = sys.stdin.readline

t = int(input())
for _ in range(t):
    n = int(input())
    nums1 = set(map(int, input().split()))
    m = int(input())
    nums2 = list(map(int, input().split()))
    for num in nums2:
        if num in nums1:
            print(1)
        else:
            print(0)