a, b, c = map(str, input().split())

def calculator(a, b, c) :
    mul = int(a)*int(c)
    dvi = int(a)//int(c)
    plu = int(a)+int(c)
    miu = int(a)-int(c)
    if b == '+' :
        print(f'{a} + {c} = {plu}')
    elif b == '-' :
        print(f'{a} - {c} = {miu}')
    elif b == '/' :
        print(f'{a} / {c} = {dvi}')
    elif b == '*' :
        print(f'{a} * {c} = {mul}')
    else :
        print('False')

calculator(a, b, c)