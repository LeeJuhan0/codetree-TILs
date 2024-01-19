num = list(map(int, input().split()))

result=0
for elem in num:
    if elem > result:
        result = elem

print(result)