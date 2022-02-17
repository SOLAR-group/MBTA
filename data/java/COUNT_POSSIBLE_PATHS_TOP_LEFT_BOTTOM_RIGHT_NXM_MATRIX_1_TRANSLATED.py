====================
def f_gold ( m , n ) :
    count = [ [ 0 ] * m for i in range ( m ) ]
    for i in range ( n ) :
        count [ 0 ] [ j ] = 1
    for i in range ( 1 , m ) :
        for j in range ( 1 , n ) :
            count [ i ] [ j ] = count [ i - 1 ] [ j ] + count [ i ] [ j - 1 ]
    return count [ m - 1 ] [ n - 1 ]

