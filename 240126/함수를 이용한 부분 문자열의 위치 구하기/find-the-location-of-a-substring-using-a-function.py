inp = str(input())
purpose = str(input())

def location(a, b) :
    cnt = 0
    global k
    for i in range(len(a)) :
        for j in range(len(a)) :
            if a[i:j+1] == b :
                cnt += 1
                k = i
    if cnt >= 1 :
        print(k)
    else :
        print('-1') 
            

location(inp, purpose)