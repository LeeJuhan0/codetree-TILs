def print_HelloWorld(n) :
    if n == 0 :
        return

    print_HelloWorld(n-1)
    print('HelloWorld')

n=int(input())
print_HelloWorld(n)