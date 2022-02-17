====================
def py_fgree_count_divisible_9_not ( str ) :
    n = len ( str )
    digitSum = 0
    for i in range ( n ) :
        digitSum += ( str [ i ] - '0' )
    return ( digitSum % 9 == 0 )

