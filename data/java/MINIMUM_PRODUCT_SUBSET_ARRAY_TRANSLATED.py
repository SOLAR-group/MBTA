====================
def f_gold ( a , n ) :
    if n == 1 :
        return a [ 0 ]
    negmax = int ( a [ 0 ] )
    posmin = int ( a [ 0 ] )
    count_neg , count_zero = 0 , 0
    product = 1
    for i in range ( n ) :
        if a [ i ] == 0 :
            count_zero += 1
            continue
        if a [ i ] < 0 :
            count_neg += 1
            negmax = max ( negmax , a [ i ] )
        if a [ i ] > 0 and a [ i ] < posmin :
            posmin = a [ i ]
        product *= a [ i ]
    if count_zero == n or ( count_neg == 0 and count_zero > 0 ) :
        return 0
    if count_neg == 0 :
        return posmin
    if count_neg % 2 == 0 and count_neg != 0 :
        product = product / negmax
    return product

