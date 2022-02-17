====================
def f_gold ( n ) :
    res = [ 0 ] * ( n + 1 )
    for i in range ( 2 , n + 1 ) :
        res [ i ] = max ( i , ( res [ i / 2 ] + res [ i / 3 ] + res [ i / 4 ] + res [ i / 5 ] ) )
    return res

