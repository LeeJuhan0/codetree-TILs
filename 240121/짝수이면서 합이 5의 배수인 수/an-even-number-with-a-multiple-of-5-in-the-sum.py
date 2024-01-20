def solution(n):
    N=[int(i) for i in str(n)]

    return sum(N)


def number_judge(n) :
    return n % 2 == 0 and solution(n) % 5 == 0 

a = int(input())

if number_judge(a) :
    print('Yes')

else :
    print('No')