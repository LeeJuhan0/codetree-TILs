def def_flower(n) :
    if n == 0 :
        return
    print(n, end=' ')
    def_flower(n-1)
    print(n, end=' ')

n=int(input())
def_flower(n)