n, m = map(int, input().split())
list1 = []
result_cnt = 0

for i in range(n):
    row = list(map(int, input().split()))
    list1.append(row)


def Continuous_check(a):
    global result_cnt
    cnt = 1
    for i in range(a-1):
        if new_list[i] == new_list[i+1] :
            cnt += 1
            if cnt >= m :
                result_cnt += 1
                break
        else :
            cnt = 1

if m == 1:
    print(n*2)

else:
    #가로부터 체크
    for i in range(n):
        new_list = []
        for j in range(n):
            row_part_element = list1[i][j]
            new_list.append(row_part_element)
        Continuous_check(len(new_list))
                
#세로도 체크
    for i in range(n):
        new_list = []
        for j in range(n):
            row_part_element = list1[j][i]
            new_list.append(row_part_element)
        Continuous_check(len(new_list))

    print(result_cnt)