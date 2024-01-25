a, b =map(int, input().split())
list1 = []

def calcultion(a,b) :
    if a < b :
        a *= 2
        b +=25
    elif b < a :
        b *= 2
        a += 25 
    list1.append(a)
    list1.append(b)
calcultion(a,b)

for i in list1:
    print(i, end=" ")