n = int(input())

# Please write your code here.
squar = [0] * 1001
squar[0] = 0
squar[1] = 1
squar[2] = 2
squar[3] = 3
squar[4] = 5

for i in range(4,n+1) :
    squar[i] = squar[i-2]*2 + squar[i-3]
print(squar[n]%10007)