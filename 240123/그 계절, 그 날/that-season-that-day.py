def leap_year(n) :
    if n % 4 != 0 :
        return False
    elif n % 4 == 0 and n % 100 == 0 and n % 400 != 0:
        return False
    elif n % 4 != 0 and n % 100 != 0 and n % 400 != 0 :
        return False
    else :
        return True

def calendar(Y, M, D) :
    for i in range(1,8,2) :
        if M == i or M == 8 or M == 10 or M == 12 :
            for j in range(1,32) :
                if D == j :
                    return True
    if M == 4 or M == 6 or M == 9 or M == 11 :
        for i in range(1,31) :
            if D == i :
                return True
    if M == 2 and leap_year(Y) :
        for i in range(1,30) :
            if D == i :
                return True
    if M == 2 and not leap_year(Y):
        for i in range(1,29) :
            if D == i :
                return True         
    return False

def season(M) :
    for i in range(3,6) :
        if M == i :
            print('Spring')
    for i in range(6,9) :
        if M == i :
            print('Summer')        
    for i in range(9,12) :
        if M == i :
            print('Fall')
    if M == 1 or M == 2 or M == 12 :
        print('Winter')

Y, M, D = map(int, input().split())

if calendar(Y, M, D) :
    season(M)
else :
    print('-1')