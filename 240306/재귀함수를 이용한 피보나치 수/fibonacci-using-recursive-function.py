N = int(input())

def Pavonacci_sequence(n) :
    if n == 1 :
        return 1
    if n == 2 :
        return 1
     
    return Pavonacci_sequence(n-1)  + Pavonacci_sequence(n-2)

print(Pavonacci_sequence(N))