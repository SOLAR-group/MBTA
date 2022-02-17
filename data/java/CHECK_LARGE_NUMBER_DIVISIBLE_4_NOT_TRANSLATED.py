====================
def py2exe_check ( ) :
    n = len ( str ( x ) for x in range ( 0 , 4 ) )
    if n == 0 :
        return False
    if n == 1 :
        return ( ( str ( x ) [ 0 ] - '0' ) % 4 == 0 )
    last = str ( n - 1 ) [ - 1 ] - '0'
    second_last = str ( n - 2 ) [ - 1 ] - '0'
    return ( ( second_last * 10 + last ) % 4 == 0 )

