n,m,k = map(int, input().split())
arr = list(map(int, input().split()))
arr = sorted(arr, reverse = True)
div = m//(k+1)
mod = m%(k+1)
print(div*arr[0]*k , div*arr[1], arr[0])
answer = div*arr[0]*k + div*arr[1] + mod*arr[0]

print(answer)

