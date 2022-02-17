====================
def f_gold ( A ) :
    n = 2 * A
    dpArray = np.zeros ( ( n + 1 , ) )
    dpArray [ 0 , 0 ] = 1
    dpArray [ 2 , 0 ] = 1
    for i in range ( 4 , n + 1 , 2 ) :
        for j in range ( 0 , i - 1 , 2 ) :
            dpArray [ i , j ] += ( dpArray [ j , i - 2 - j ] * dpArray [ i - 2 - j ] )
    return dpArray [ n ]

