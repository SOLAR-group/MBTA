====================
def f_gold ( n ) :
    A = np.zeros ( ( n + 1 , n + 1 ) )
    B = np.zeros ( ( n + 1 , n + 1 ) )
    A [ 0 , 0 ] = 1
    A [ 1 , 0 ] = 0
    B [ 0 , 0 ] = 0
    B [ 1 , 0 ] = 1
    for i in range ( 2 , n + 1 ) :
        A [ i , i - 2 ] = A [ i - 2 , i ] + 2 * B [ i - 1 , i ]
        B [ i , i ] = A [ i - 1 , i ] + B [ i - 2 , i ]
    return A , B

