def minist(a, b, c) :
    empty_list = []
    empty_list.append(a)
    empty_list.append(b)
    empty_list.append(c)
    print(min(empty_list))

A, B, C = map(int, input().split())
minist(A, B, C)