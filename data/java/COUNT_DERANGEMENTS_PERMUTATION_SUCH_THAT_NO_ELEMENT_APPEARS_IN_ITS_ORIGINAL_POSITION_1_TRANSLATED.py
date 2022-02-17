====================
def f_gold ( n ) :
    der = [ 1 , 0 , 1 , 1 ]
    for i in range ( 3 , n + 1 ) :
        der [ i ] = ( i - 1 ) * ( der [ i - 1 ] + der [ i - 2 ] )
    return der

