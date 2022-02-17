====================
def f_gold ( mat , N ) :
    dp = np.zeros ( ( N , N ) )
    dp [ 0 ] [ 0 ] = mat [ 0 ] [ 0 ]
    for i in range ( 1 , N ) :
        dp [ i ] [ 0 ] = mat [ i ] [ 0 ] + dp [ i - 1 ] [ 0 ]
    for i in range ( 1 , N ) :
        for j in range ( 1 , i + 1 and j < N ) :
            dp [ i ] [ j ] = mat [ i ] [ j ] + max ( dp [ i - 1 ] [ j - 1 ] , dp [ i - 1 ] [ j ] )
    result = 0
    for i in range ( N ) :
        if result < dp [ N - 1 ] [ i ] :
            result = dp [ N - 1 ] [ i ]
    return result

