====================
def f_gold ( array , m , n ) :
    counter = 0
    for i in range ( m ) :
        for j in range ( n ) :
            if array [ i ] [ j ] == 0 :
                counter += 1
        return ( counter > ( ( m * n ) / 2 ) )

