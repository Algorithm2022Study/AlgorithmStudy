def isPrime(num):
    c = 0
    for i in range(2,num):
        if (num%i==0):
            c+=1
    if c>0:
        return False
    return True

n = int(input())
arr = list(map(int, input().split()))
count = 0

for i in arr:
    if (i==1):
        continue
    elif (isPrime(i)):
        count+=1

print(count)
