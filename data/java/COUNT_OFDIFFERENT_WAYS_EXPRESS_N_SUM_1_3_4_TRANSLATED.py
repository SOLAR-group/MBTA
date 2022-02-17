====================
def f_gold ( n ) :
    DP = np.zeros ( ( n + 1 , n + 1 ) )
    DP [ 0 , 0 ] = DP [ 1 , 1 ] = DP [ 2 , 2 ] = 1
    DP [ 3 , 3 ] = 2
    for i in range ( 4 , n + 1 ) :
        DP [ i , i ] = DP [ i - 1 , i - 3 ] + DP [ i - 4 , i - 2 ]
    return DP

