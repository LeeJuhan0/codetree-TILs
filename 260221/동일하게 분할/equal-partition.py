import sys


input_data = sys.stdin.read().split()

n = int(input_data[0])
nums = list(map(int, input_data[1:n+1]))

total_sum = sum(nums)
    
target = total_sum // 2

dp = [False] * (target + 1)
dp[0] = True  

for num in nums:
    for j in range(target, num - 1, -1):
        if dp[j - num]: 
            dp[j] = True 
 
if total_sum % 2 != 0:
    print("No") 
else:          
    if dp[target]:
        print("Yes")
    else:
        print("No")
