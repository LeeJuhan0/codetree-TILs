def calendar2021(M, D) :
    for i in range(1,8,2):
        if M == i or M == 8 or M == 10 or M == 12 :
            for j in range(1,32) :
                if D == j :
                    return True
    if M == 4 or M == 6 or M == 9 or M == 11 :
        for i in range(1,31) :
            if D == j :
                return True
    if M == 2:
        for i in range(1,29) :
            if D == j :
                return True
    
    return False

M, D = map(int, input().split())

if calendar2021(M, D) :
    print('Yes')
else :
    print('No')