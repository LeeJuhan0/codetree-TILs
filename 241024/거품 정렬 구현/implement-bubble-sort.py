n = int(input())
list1 = list(map(int, input().split()))

for i in range(n-1):
    for j in range(n-1):
        if list1[j] > list1[j+1] :
            temp = list1[j]
            list1[j] = list1[j+1]
            list1[j+1] = temp

for i in list1:
    print(i, end=' ')