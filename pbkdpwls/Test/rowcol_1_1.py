# 블로그 풀이 링크
# https://squidward-tentac1es.tistory.com/78

# 데크: 앞, 뒤 양쪽 방향에서 엘리먼트(element)를 추가하거나 제거
# 행과 가장자리 열 관리에 사용할 것
from collections import deque


def solution(rc, operations):
    rowNum, colNum = len(rc), len(rc[0])  # 행의 수, 열의 수

    # ShiftRow 연산을 위해 행별로 관리 => 양쪽 원소를 제외한 행
    rows = deque(deque(row[1:-1]) for row in rc)

    # Rotate 연산을 위해 바깥쪽 원소들(열별)을 관리 [첫열, 마지막열]
    out_cols = [deque(rc[r][0] for r in range(rowNum)),
                deque(rc[r][colNum - 1] for r in range(rowNum))]

    # 연산
    for operation in operations:
        if operation[0] == "S":  # ShiftRow 연산
            # 마지막(가장 아래) 행을 처음(가장 위)로 이동
            rows.appendleft(rows.pop())
            # 첫 열과 마지막 열의 마지막(가장 아래) 원소를 처음(가장 위)으로 이동
            out_cols[0].appendleft(out_cols[0].pop())
            out_cols[1].appendleft(out_cols[1].pop())

        else:  # Rotate 연산, 4개만 처리하면 됨.
            # *** rows가 비어있을 수 있기 때문에 순서 주의 ***
            # 마지막 열의 마지막(가장 아래) 원소를 마지막 행의 마지막(가장 오른쪽)으로 이동
            rows[rowNum - 1].append(out_cols[1].pop())
            # 마지막 행의 첫(가장 왼쪽) 원소를 첫 열의 마지막(가장 아래)으로 이동
            out_cols[0].append(rows[rowNum - 1].popleft())
            # 첫 열의 첫(가장 위) 원소를 첫 행의 처음(가장 왼쪽)으로 이동
            rows[0].appendleft(out_cols[0].popleft())
            # 첫 행의 마지막(가장 오른쪽) 원소를 마지막 열의 처음(가장 위)으로 이동
            out_cols[1].appendleft(rows[0].pop())

    answer = []
    for r in range(rowNum):
        answer.append([])
        answer[r].append(out_cols[0][r])
        answer[r].extend(rows[r])
        answer[r].append(out_cols[1][r])

    return answer
