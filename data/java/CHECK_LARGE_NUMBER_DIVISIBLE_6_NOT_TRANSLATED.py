====================
def import ( str ) :
    n = len ( str )
    if ( str [ n - 1 ] - '0' ) % 2 != 0 :
        return False
    digitSum = 0
    for i in range ( n ) :
        digitSum += ( str [ i ] - '0' )
    return ( digitSum % 3 == 0 )

