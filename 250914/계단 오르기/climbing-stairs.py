n = int(input())

# Please write your code here.
def climb(n):
    if n == 0:
        return 1
    elif n < 0 :
        return 0

    return climb(n-2) + climb(n-3)

print(climb(n))