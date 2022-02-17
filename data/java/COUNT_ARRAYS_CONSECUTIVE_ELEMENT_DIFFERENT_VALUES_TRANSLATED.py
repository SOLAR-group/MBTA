====================
def count_ARRAYS_CONSECUTIVE_ELEMENT_DIFFERENT_VALUES ( n , k , x ) :
    dp = np.zeros ( ( 109 , n ) )
    dp [ 0 , 0 ] = 0
    dp [ 1 , 1 ] = 1
    for i in range ( 2 , n ) :
        dp [ i , 1 ] = ( k - 2 ) * dp [ i - 1 , 1 ] + ( k - 1 ) * dp [ i - 2 , 1 ]
    return ( x == 1 if ( k - 1 ) * dp [ n - 2 ] else dp [ n - 1 ] )

