bracket = str(input())
brac=list(bracket)
brac_reverse = brac[::-1]
c=0

for i in range(len(brac)) :
    a=[]
    a = brac[0:i]
    if a.count('(') < a.count(')') :
        c += 1
        a.append('(')
    elif a.count('(') > a.count(')') :
        c +=1
    
c -= 1 #맨마지막 괄호

if brac.count('(') == brac.count(')') :
    c=0


print(c)