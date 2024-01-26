A = str(input())
list1 = []

def sample(n) :
    for i in n :
        list1.append(i)

def Alphabet(n):
    sample(n)
    cnt = 0
    for i in range(len(list1)) :
        for j in range(len(list1)) :
            if n[i] != n[j]  :
                cnt += 1
    if cnt >= 1 :
        return True
    else :
        return False

if Alphabet(A) :
    print('Yes')
else :
    print('No')