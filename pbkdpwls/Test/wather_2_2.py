# 문제 풀이 주소
# https://squidward-tentac1es.tistory.com/manage/posts/

H, W = map(int, input().split())
sky = [input() for _ in range(H)]
answer = [[0] * W for _ in range(H)]

for i in range(H):
    cnt = 1
    cloud = False
    for j in range(W):
        if not cloud and sky[i][j] == '.':
            answer[i][j] = -1
        elif sky[i][j] == 'c':
            cloud = True
            answer[i][j] = 0
            cnt = 1
        elif cloud and sky[i][j] == '.':
            answer[i][j] = cnt
            cnt += 1

for i in answer:
    print(*i, end=' ')
    print()