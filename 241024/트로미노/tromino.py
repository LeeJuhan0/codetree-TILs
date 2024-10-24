n, m = map(int, input().split())
list1 = []
answerlist = []
for _ in range(n):
    list2 = list(map(int, input().split()))
    list1.append(list2) 

for i in range(n):           
    for j in range(m-2):
        sum = list1[i][j] + list1[i][j+1] + list1[i][j+2]
        answerlist.append(sum) #행더하기


for j in range(m):           
    for i in range(n-2):
        sum = list1[i][j] + list1[i+1][j] + list1[i+2][j]
        answerlist.append(sum) #열더하기

for i in range(n-1):           
    for j in range(m-1):
        sum = list1[i][j] + list1[i+1][j] + list1[i+1][j+1]
        answerlist.append(sum) #ㄴ자더하기

for i in range(n-1):           
    for j in range(m-1):
        sum = list1[i][j] + list1[i][j+1] + list1[i+1][j+1]
        answerlist.append(sum) #ㄱ자더하기

for i in range(n-1):           
    for j in range(m-1):
        sum = list1[i+1][j] + list1[i+1][j+1] + list1[i][j+1]
        answerlist.append(sum) #ㄴ뒤집어서더하기

for i in range(n-1):           
    for j in range(m-1):
        sum = list1[i][j] + list1[i+1][j] + list1[i][j+1]
        answerlist.append(sum) #ㄱ뒤집어서더하기

#답안지에서 가장큰거고르기
print(max(answerlist))