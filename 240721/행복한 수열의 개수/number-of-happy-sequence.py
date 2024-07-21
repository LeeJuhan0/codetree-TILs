n, m = map(int, input().split())
list1 = []
result_cnt = 0

# Read the matrix
for i in range(n):
    row = list(map(int, input().split()))
    list1.append(row)

def Continuous_check(a):
    global result_cnt  # Use the global variable
    cnt = 1  # Initialize count to 1 since we count the first occurrence
    for i in range(1, a):
        if new_list[i] == new_list[i - 1]:
            cnt += 1
            if cnt == m:
                result_cnt += 1
                break
        else:
            cnt = 1

# Check horizontally
for i in range(n):
    new_list = list1[i]
    Continuous_check(len(new_list))

# Check vertically
for i in range(n):
    new_list = [list1[j][i] for j in range(n)]
    Continuous_check(len(new_list))

print(result_cnt)