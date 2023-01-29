answer = 0  # 최대 탐험 횟수(반환값) 전역변수로 초기화


def dfs(k, dungeons, cnt, ch):
    global answer
    answer = max(answer, cnt)  # 탐험 횟수 업데이트

    for i in range(len(dungeons)):  # 모든 경우의 수 탐색
        if ch[i] == 0 and k >= dungeons[i][0]:  # 방문되지 않았고, 최소 필요 피로도 조건 충족하는 것
            ch[i] = 1  # 방문 표시
            dfs(k - dungeons[i][1], dungeons, cnt + 1, ch)  # 재귀함수, 피로도 소모 & 탐험횟수 증가
            ch[i] = 0  # 재귀함수 끝나고, 방문표시 해제


def solution(k, dungeons):  # 시작 피로도, 피로도 배열 주어짐
    ch = [0 for i in range(len(dungeons))]  # 방문 확인 배열 0으로 모두 초기화

    dfs(k, dungeons, 0, ch)  # dfs 호출. 탐험 횟수 셀 cnt 변수 0으로 주기

    return answer



