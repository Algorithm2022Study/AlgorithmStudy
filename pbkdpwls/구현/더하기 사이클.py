n = int(input())
count=0
cycleNum=n

while True:
    if cycleNum < 10:
        last = cycleNum
        cycleNum = last*10+last
    else:
        first = cycleNum // 10 # 6
        last = cycleNum % 10 # 8
        sum_ = first + last # 14
        if sum_>= 10:
            sum_ = sum_%10 # 4
        cycleNum = last*10 + sum_
    count+=1
    if cycleNum == n:
        break

print(count)