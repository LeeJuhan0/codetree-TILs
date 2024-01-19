n = int(input())
a = list(map(int, input().split()))

minmum= 1000000
for elem in a :
    if minmum > elem :
        minmum = elem

print(f'{minmum} {a.count(minmum)}')