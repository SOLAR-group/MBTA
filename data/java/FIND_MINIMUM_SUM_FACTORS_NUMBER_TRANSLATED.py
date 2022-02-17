====================
def find_minimum_sUM_FACTORS_NUMBER ( num ) :
    sum = 0
    for i in range ( 2 , num * i <= num + 1 ) :
        while num % i == 0 :
            sum += i
            num /= i
    sum += num
    return sum

