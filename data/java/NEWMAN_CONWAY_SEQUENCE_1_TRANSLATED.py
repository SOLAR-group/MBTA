====================
def f_gold ( n ) :
    f = [ 0 ] * ( n + 1 )
    i = 0
    for i in range ( 3 , n + 1 ) :
        f [ i ] = f [ i - 1 ] + f [ i - f [ i - 1 ] ]
    return f [ n ]

