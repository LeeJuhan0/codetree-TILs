N = int(input())

def sum_of_squares(n) :
    if n < 1 :
        return n 

    return sum_of_squares(n // 10) + ((n%10)*(n%10))

print(sum_of_squares(N))