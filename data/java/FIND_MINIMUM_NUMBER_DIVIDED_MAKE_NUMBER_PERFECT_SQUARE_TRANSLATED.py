====================
def find_minimum_number_divided_make_number_perfECT_square ( n ) :
    count , ans = 0 , 1
    while n % 2 == 0 :
        count += 1
        n /= 2
    if count % 2 == 1 :
        ans *= 2
    for i in range ( 3 , math.sqrt ( n ) , 2 ) :
        count = 0
        while n % i == 0 :
            count += 1
            n /= i
        if count % 2 == 1 :
            ans *= i
    if n > 2 :
        ans *= n
    return ans

