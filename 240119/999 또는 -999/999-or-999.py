num = list(map(int, input().split()))

maximum = -999
minimum = 999

for i in num :
    if i > maximum and i < 999 :
        maximum = i

for j in num :
    if j < minimum and j > -999 :
        minimum = j

print(f'{maximum} {minimum}')