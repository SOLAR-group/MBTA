====================
def f_gold ( s ) :
    n = len ( s )
    auxArr = [ ]
    if s [ 0 ] == '1' :
        auxArr.append ( 1 )
    for i in range ( 1 , n ) :
        if s [ i ] == '1' :
            auxArr.append ( auxArr [ i - 1 ] + 1 )
        else :
            auxArr.append ( auxArr [ i - 1 ] )
    count = 0
    for i in range ( n - 1 , - 1 , - 1 ) :
        if s [ i ] == '1' :
            count += auxArr [ i ]
    return count

