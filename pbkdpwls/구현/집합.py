import sys
array = set()

n = int(sys.stdin.readline())

for i in range(n):
    li = sys.stdin.readline().split()

    if len(li)==2:
        cal, x = li[0], int(li[1])
        if cal == 'add':
            array.add(x)
        elif cal == 'remove':
            array.discard(x)
        elif cal == 'check':
            print(1 if x in array else 0)
        elif cal == 'toggle':
            if x in array:
                array.discard(x)
            else:
                array.add(x)
    else:
        cal = li[0]
        if cal == 'all':
            array = {1,2,3,4,5,6,7,8,9,10,11,12,13,14,15,16,17,18,19,20}
            # array = set([i for i in range(1, 21)])
        elif cal == 'empty':
            array.clear()
