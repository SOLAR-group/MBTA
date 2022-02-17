====================
def get_number_divisible_3_not ( str ) :
    n = len ( str )
    digitSum = 0
    for i in range ( n ) :
        digitSum += ( str [ i ] - '0' )
    return ( digitSum % 3 == 0 )

