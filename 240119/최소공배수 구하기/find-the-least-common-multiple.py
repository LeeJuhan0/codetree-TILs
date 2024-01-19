N, M = map(int, input().split())

def least_common_multiple(n,m) :
    result_list=[]
    for i in range(1,n*m+1):
        if i % n == 0 and i % m == 0 :
            result_list.append(i)
    print(min(result_list))

least_common_multiple(N, M)