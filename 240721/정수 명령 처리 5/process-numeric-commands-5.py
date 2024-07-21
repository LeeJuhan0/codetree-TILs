list_data = []

def push_back(a):
    list_data.append(a)

def pop_back(a):
    if list_data:
        list_data.pop()  

def size():
    print(len(list_data))

def get(n):
    if 0 < n <= len(list_data):
        print(list_data[n-1])  
    else:
        print("Index out of range")

a = int(input())
for i in range(a):
    input_data = input().split()
    b = input_data[0]
    if b == "push_back":
        c = input_data[1]
        push_back(c)
    elif b == "pop_back":
        pop_back(None)  
    elif b == "size":
        size()
    elif b == "get":
        c = int(input_data[1])
        get(c)