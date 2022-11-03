import sys
input = sys.stdin.readline
sys.setrecursionlimit(10**9)

N = int(input())

Tree = [[] for _ in range(N+1)]

Parents = [0 for _ in range(N+1)]

for _ in range(N-1):
    a,b = map(int, input().split())
    Tree[a].append(b)
    Tree[b].append(a)

def DFS(start,tree,parents):
    for i in tree[start]:
        if parents[i]==0:
            parents[i]=start
            DFS(i,tree,parents)

DFS(1,Tree,Parents)

for i in range(2, N+1):
    print(Parents[i])