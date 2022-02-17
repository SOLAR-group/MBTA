====================
def f_gold ( n ) :
    """
 Return the number of steps in the optimal solution to the given number of steps.
 """
    table = [ n + 1 ] * ( n + 1 )
    for i in range ( 0 , n + 1 ) :
        table [ i ] = n - i
    for i in range ( n , - 1 , - 1 ) :
        if not ( i % 2 > 0 ) :
            table [ i / 2 ] = min ( table [ i ] + 1 , table [ i / 2 ] )
        if not ( i % 3 > 0 ) :
            table [ i / 3 ] = min ( table [ i ] + 1 , table [ i / 3 ] )
    return table [ 1 ]

