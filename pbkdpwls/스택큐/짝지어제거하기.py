def solution(s):
    if len(s) % 2:  # 홀수라면
        return 0
    if len(s) == 2:
        if s[0] == s[1]:
            return 1

    stack = [s[0]]

    for s in s[1:]:
        if len(stack) > 0 and s == stack[-1]:
            stack.pop()
        else:
            stack.append(s)

    return 0 if len(stack) else 1