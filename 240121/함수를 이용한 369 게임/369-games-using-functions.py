def multiple369(n) :
    return n % 3 == 0 or n % 6 == 0 or n % 9 == 0 
            
def input_3_6_9(n) :
    N1 = [int(i) for i in str(n)]
    N2 = []
    for i in range(1,4):
        N2.append(N1.count(3*i))
    return  sum(N2) >= 1 or multiple369(n)

a, b= map(int, input().split())
cnt = 0
for i in range(a, b+1) :
    if input_3_6_9(i) :
        cnt += 1

print(cnt)