n = int(input())
a = list(map(int, input().split()))
cnt = n
k = [0]

while cnt > 0 and k[-1] != 1:
    cnt -=1
    maximum=max(a)
    k.append(a.index(maximum)+1)
    del a[a.index(maximum):]

k.remove(0)


for i in k:
    print(i, end=' ')