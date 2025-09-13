n = int(input())

# Please write your code here.
BST = [0] * 20

BST[0] =1
BST[1] = 1
BST[2] = 2
BST[3] = 5

for i in range(4,n+1) : 
    k = 0
    for j in range(0,i) :
        k += BST[j] * BST[i-j-1] 
    BST[i] = k
print(BST[n])