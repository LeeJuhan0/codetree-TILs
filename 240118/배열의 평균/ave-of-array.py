a = []
for i in range(2) :
    a_i = list(map(int, input().split()))
    a.append(a_i)


for i in range(2):
	sum_val = 0
	for j in range(4):
		sum_val += a[i][j]
	print(f"{sum_val / 4:.1f}", end=" ")
print()

for j in range(4):
	sum_val = 0
	for i in range(2):
		sum_val += a[i][j]
	print(f"{sum_val / 2:.1f}", end=" ")
print()

sum_val = 0
for i in range(4):
	for j in range(2):
		sum_val += a[j][i]
print(f"{sum_val / 8:.1f}")