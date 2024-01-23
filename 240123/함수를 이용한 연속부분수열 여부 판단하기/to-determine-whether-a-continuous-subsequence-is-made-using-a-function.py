a, b = map(int, input().split())

def Consecutive_Number_Sub_Sequence_Judge(A, B):
    listA = list(map(int, input().split()))
    listB = list(map(int, input().split()))
    cnt = 0    
    for i in range(0, A) :
        for j in range(0, A) : 
            if listA[j:i] == listB :
                cnt += 1
                
    if cnt >= 1:
        return True
    else :
        return False

if Consecutive_Number_Sub_Sequence_Judge(a,b) :
    print('Yes')
else :
    print('No')