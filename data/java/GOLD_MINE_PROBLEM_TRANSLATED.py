====================
def f_gold ( gold , m , n ) :
    """
 Return the gold number of the first row of the matrix gold.
 """
    goldTable = np.zeros ( ( m , n ) )
    for rows in goldTable :
        np.random.shuffle ( rows )
    for col in range ( n - 1 , - 1 , - 1 ) :
        for row in range ( m ) :
            right = ( col == n - 1 )
            right_up = ( row == 0 or col == n - 1 )
            right_down = ( row == m - 1 or col == n - 1 )
            goldTable [ row , col ] = gold [ row , col ] + max ( right , max ( right_up , right_down ) ) ;
    res = goldTable [ 0 , 0 ]
    for i in range ( 1 , m ) :
        res = max ( res , goldTable [ i , 0 ] )
    return res

