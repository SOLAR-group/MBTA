====================
def leonardo_number_1 ( n ) :
    dp = [ 0 ] * ( n + 1 )
    for i in range ( 2 , n + 1 ) :
        dp [ i ] = dp [ i - 1 ] + dp [ i - 2 ] + 1
    return dp [ n ]
