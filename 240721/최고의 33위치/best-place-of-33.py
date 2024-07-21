n = int(input())
list1 = []
result_list = []

for i in range(n):
    horizontal = list(map(int, input().split()))
    list1.append(horizontal)


for k in range(n-2):
    for l in range(n-2):
        cnt_of_1 = 0
        for i in range(3):
            for j in range(3):
                if list1[i+k][j+l] == 1:
                    cnt_of_1 += 1
        result_list.append(cnt_of_1)

print(max(result_list))