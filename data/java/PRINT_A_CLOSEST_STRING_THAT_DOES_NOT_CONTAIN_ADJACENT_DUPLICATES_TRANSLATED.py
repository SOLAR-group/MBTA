====================
def f_gold ( s1 ) :
    n = len ( s1 )
    s = s1.split ( )
    for i in range ( 1 , n ) :
        if s [ i ] == s [ i - 1 ] :
            s [ i ] = 'a'
            while s [ i ] == s [ i - 1 ] or ( i + 1 < n and s [ i ] == s [ i + 1 ] ) :
                s [ i ] += 1
            i += 1
    return ( [ s [ i ] for i in range ( 1 , n ) ] )

