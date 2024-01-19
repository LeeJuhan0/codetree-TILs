num = list(map(int, input().split()))

maximum = -998
minimum = 998

for i in num :
    if i > maximum and i < 999:
        maximum = i

for j in num :
    if j < minimum and i > -999 :
        minimum = j

print(f'{maximum} {minimum}')