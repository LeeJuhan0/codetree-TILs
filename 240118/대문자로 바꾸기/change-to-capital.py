b = []
for i in range(5):
    a = input().split()
    b.append(a)

B = []
for i in range(5):
    B.append(" ".join(map(str.upper, b[i])))

for i in range(5):
    print(B[i])