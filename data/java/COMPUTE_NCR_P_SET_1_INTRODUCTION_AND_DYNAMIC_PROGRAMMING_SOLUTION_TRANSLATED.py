====================
def f_gold ( n , r , p ) :
    C = np.zeros ( ( r + 1 , ) )
    C [ 0 , 0 ] = 1
    for i in range ( 1 , n + 1 ) :
        for j in range ( min ( i , r ) , r ) :
            C [ j , j ] = ( C [ j , j - 1 ] + C [ j - 1 , j ] ) % p
    return C

