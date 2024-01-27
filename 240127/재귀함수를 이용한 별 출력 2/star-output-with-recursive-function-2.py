def print_stars2(n) :
    if n == 0 :
        return
    for i in range(n):
        print('*', end = " ")
    print("")
    print_stars2(n-1)
    for i in range(n):
        print('*', end = " ")
    print("")

n=int(input())
print_stars2(n)