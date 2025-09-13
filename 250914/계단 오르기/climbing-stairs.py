n = int(input())

climb = [0] *1000
climb[0] = 1
climb[1] = 0
climb[2] = 1
climb[3] = 1
# Please write your code here.
for i in range(3,n+1):
    climb[i] = climb[i-2] + climb[i - 3]
    

print(climb[n]%10007) 

