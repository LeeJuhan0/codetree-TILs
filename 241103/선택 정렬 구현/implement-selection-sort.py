size = int(input())
arr = list(map(int, input().split()))

def selection_sort(arr):
    
    for i in range(size-1):
        minimum = i
        for j in range(i+1,size):
            if arr[j] < arr[minimum] :
                minimum = j
        temp = arr[i]
        arr[i] = arr[minimum]
        arr[minimum] = temp

    for i in arr:
        print(i, end=' ')

selection_sort(arr)