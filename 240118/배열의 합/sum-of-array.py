n = 4
arr_2d = []
for i in range(n):
    arr_1d = list(map(int, input().split()))
    arr_2d.append(arr_1d)
    k=sum(arr_2d[i])
    print(k)