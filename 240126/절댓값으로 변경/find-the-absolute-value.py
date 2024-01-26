N = int(input()) 
list1 = list(map(int, input().split()))
list2 = []
def vertical_bars(n) :
    for i in n :
        if i < 0 :
            i += (-i)*2
            list2.append(i)
        else : 
            list2.append(i)


vertical_bars(list1)
for i in list2 :
    print(i, end=" ")