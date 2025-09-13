n = int(input())

# Please write your code here.
square = [0] * 1001
square[0] = 1
square[1] = 1
square[2] = 3

for i in range(3,n+1) :
    square[i] = square[i-1] + square[i-2] * 2

print(square[n]%10007)