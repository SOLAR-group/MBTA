====================
def DYNAMIC_PROGRAMMING_SET_8_MATRIX_CHAIN_MULTIPLICATION_1 ( p , n ) :
    m = [ [ ] for i in range ( n ) ]
    i , j , k , L , q = 0 , 0 , 0 , 0
    for i in range ( 1 , n ) :
        m [ i ] [ i ] = 0
    for L in range ( 2 , n ) :
        for i in range ( 1 , n - L + 1 ) :
            j = i + L - 1
            if j == n :
                continue
            m [ i ] [ j ] = int ( m [ i ] [ j ] )
            for k in range ( i , j - 1 ) :
                q = m [ i ] [ k ] + m [ k + 1 ] [ j ] + p [ i - 1 ] * p [ k ] * p [ j ]
                if q < m [ i ] [ j ] :
                    m [ i ] [ j ] = q
    return m [ 1 : n - 1 ]

