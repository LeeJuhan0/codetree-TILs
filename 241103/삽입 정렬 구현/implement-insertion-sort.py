n = int(input())
arr = list(map(int, input().split()))

def insert_sort(arr):                       / 54321   45321
    size = n
    for i in range(1,size):                 / i = 1   i =2   
        j = i - 1                           / j = 0   j = 1
        key = arr[i]                        / key = 4 key =3
        while j >= 0 and arr[j] > key :     / 
            arr[j+1] = arr[j]               / 55321   45521  44521   
            j -= 1                          / j = -1  j = 0  j= -1
        arr[j+1] = key                      / 45321          34521 

    for i in arr:            
        print(i, end=' ')

insert_sort(arr)