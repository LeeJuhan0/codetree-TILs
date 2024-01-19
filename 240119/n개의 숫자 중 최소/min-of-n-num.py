n = int(input())
a = list(map(int, input().split()))

minmum= 2**31-1
for elem in a :
    if minmum > elem :
        minmum = elem

print(f'{minmum} {a.count(minmum)}')