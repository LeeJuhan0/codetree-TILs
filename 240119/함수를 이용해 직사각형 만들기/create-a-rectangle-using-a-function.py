def printrectangle(n, m) :
    for i in range(n):
        print('1'*m)

A, B= map(int, input().split())
printrectangle(A, B)