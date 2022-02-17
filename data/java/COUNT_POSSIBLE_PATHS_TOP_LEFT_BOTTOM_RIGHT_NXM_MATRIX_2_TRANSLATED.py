====================
def f_gold ( m , n ) :
    dp = np.zeros ( ( n , m ) )
    dp [ 0 , 0 ] = 1
    for i in range ( m ) :
        for j in range ( 1 , n ) :
            dp [ j , j ] += dp [ j - 1 , j ]
    return dp [ n - 1 , n - 1 ]

