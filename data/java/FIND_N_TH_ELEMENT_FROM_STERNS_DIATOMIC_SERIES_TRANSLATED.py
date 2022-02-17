====================
def f_gold ( n ) :
    DP = np.zeros ( ( n + 1 , n + 1 ) )
    DP [ 0 , 0 ] = 0
    DP [ 1 , 0 ] = 1
    for i in range ( 2 , n + 1 ) :
        if i % 2 == 0 :
            DP [ i , i ] = DP [ i / 2 , i ]
        else :
            DP [ i , ( i - 1 ) / 2 ] = DP [ ( i + 1 ) / 2 , ( i + 1 ) / 2 ]
    return DP [ n ]

