t = int(input())

def fibo(N):
    zero = [1,0,1]
    one = [0,1,1]

    if N >= 3:
        for i in range(2,N):
            zero.append(zero[i-1]+zero[i])
            one.append(one[i-1]+one[i])

    print(zero[N],one[N])


for i in range(t):
    n = int(input())
    fibo(n)