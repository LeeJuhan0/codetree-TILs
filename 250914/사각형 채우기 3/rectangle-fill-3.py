n = int(input())

# Please write your code here.
square = [0] * 1001
square[0] = 1
square[1] = 2
square[2] = 7
square[3] = 22
square[4] = 71

for i in range(3,n+1) :
    square[i] = square[i-1]*3+square[i-2]-square[i-3]

print(square[n]%1000000007)