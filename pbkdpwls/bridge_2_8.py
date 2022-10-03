# 굴다리 길이
N = int(input())
# 가로등 수
M = int(input())
lights = list(map(int, input().split()))  # 가로등의 위치

# 가로등의 개수가 1개인 경우
if len(lights) == 1:
    height = max(lights[0], N - lights[0])

# 여러개인 경우
else:
    height = lights[0]
    for i in range(len(lights)):
        if i == (len(lights) - 1):
            tmp = N - lights[-1]
        else:
            # 마주하는 가로등의 거리
            a = lights[i + 1] - lights[i]
            # 해당 거리를 2로 나눈 나머지가 홀수 및 짝수인 경우
            if a % 2:  # 홀수인 경우에는 가로등의 높이가 1이 더 높아야 사이의 모든 거리를 비출수 있다.
                tmp = a // 2 + 1
            else:
                tmp = a // 2

        height = max(height, tmp)

print(height)