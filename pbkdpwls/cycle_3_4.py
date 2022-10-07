def cycle(n):
    first = 0
    second = 0

    if len(n) != 1:
        first = n[0]
        second = n[1]
    else:
        second = n[1]

    result = first + second
    first = result % 10
    result = second * 10 + first

    return result


n = list(map(int, input()))
num = n[0] * 10 + n[1]
count = 1

while (True):
    r = cycle(n)
    n[0] = r // 10
    n[1] = r % 10
    if r == num:
        break
    count += 1

print(count)