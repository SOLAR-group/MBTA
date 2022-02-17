====================
def f_gold ( N ) :
    dp = np.zeros ( N )
    dp [ 0 ] = 1
    dp [ 1 ] = 2
    i = 2
    do :
        dp [ i ] = dp [ i - 1 ] + dp [ i - 2 ]
    while dp [ i ] <= N :
        return ( i - 2 )

