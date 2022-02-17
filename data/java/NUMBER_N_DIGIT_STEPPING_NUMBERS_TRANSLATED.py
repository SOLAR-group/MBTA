====================
def number_n_digit_stepping_NUMBERS ( n ) :
    dp = [ 0 ] * ( n + 1 )
    if n == 1 :
        return 10
    for j in range ( 0 , 9 ) :
        dp [ 1 ] [ j ] = 1
    for i in range ( 2 , n + 1 ) :
        for j in range ( 0 , 9 ) :
            if j == 0 :
                dp [ i ] [ j ] = dp [ i - 1 ] [ j + 1 ]
            elif j == 9 :
                dp [ i ] [ j ] = dp [ i - 1 ] [ j - 1 ]
            else :
                dp [ i ] [ j ] = dp [ i - 1 ] [ j - 1 ] + dp [ i - 1 ] [ j + 1 ]
    sum = 0
    for j in range ( 1 , 9 ) :
        sum += dp [ n ] [ j ]
    return sum

