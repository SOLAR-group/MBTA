====================
def f_gold ( A , B , m , n ) :
    dp = np.zeros ( ( n + 1 , m + 1 ) )
    for row in dp :
        np.fill_diagonal ( row , 0 )
    for i in range ( 1 , n + 1 ) :
        for j in range ( i , m + 1 ) :
            dp [ i , j ] = max ( ( dp [ i - 1 , j - 1 ] + ( A [ j - 1 , i - 1 ] * B [ i - 1 , j ] ) ) , dp [ i , j - 1 ] )
    return dp [ n , m ]

