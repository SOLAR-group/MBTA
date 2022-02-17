====================
def f_gold ( ar , n ) :
    if n <= 4 :
        return sum ( ar ).min ( ).astype ( int )
    sum = [ ar [ i ] for i in range ( n ) ]
    for i in range ( 4 , n ) :
        sum [ i ] = ar [ i ] + sum [ i - 4 ]
    return sum

