====================
def get_f_gold ( n , k , a ) :
    """
 Return the number of gold elements in the given n and k of a.
 """
    temp = 0
    for i in range ( n ) :
        for j in range ( i + 1 , n ) :
            if a [ i ] < a [ j ] :
                temp = a [ i ]
                a [ i ] , a [ j ] = a [ j ] , temp
    f_gold = 0
    for i in range ( 0 , n , k ) :
        f_gold += ( 2 * a [ i ] )
    return f_gold

