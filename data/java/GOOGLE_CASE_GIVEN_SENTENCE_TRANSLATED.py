====================
def f_gold ( s ) :
    n = len ( s )
    s1 = "".join ( [ chr ( ord ( c ) ) for c in s ] )
    s1 = s1 + chr ( ord ( s [ 0 ] ) + ord ( s [ 1 ] ) )
    for i in range ( 1 , n ) :
        if s [ i ] == ' ' and i < n :
            s1 = s1 + " " + chr ( ord ( s [ i + 1 ] ) + ord ( s [ i + 2 ] ) )
            i += 1
        else :
            s1 = s1 + chr ( ord ( s [ i ] ) + ord ( s [ i ] ) )
    return s1

