====================
def f_gold ( s ) :
    n = len ( s )
    count = 0
    for i in range ( n ) :
        if s [ i ] in [ '4' , '8' , '0' ] :
            count += 1
    for i in range ( n - 1 ) :
        h = ( s [ i ] - '0' ) * 10 + ( s [ i + 1 ] - '0' )
        if h % 4 == 0 :
            count = count + i + 1
    return count

