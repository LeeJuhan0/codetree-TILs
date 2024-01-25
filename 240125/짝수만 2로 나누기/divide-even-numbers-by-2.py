N = int(input())
a = list(map(int, input().split()))

list1 = []
def devide2(n) :
    if n % 2 == 0 :
        list1.append(n/2)
    else :
        list1.append(n)

for i in a :
    devide2(i)

for i in list1 :
    print(int(i), end=" " )