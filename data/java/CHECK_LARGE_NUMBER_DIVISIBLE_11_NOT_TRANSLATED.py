====================
def py2exe_check_LARGE_NUMBER_DIVISIBLE_11_NOT ( ) :
    n = len ( str ( x ) for x in range ( n ) )
    oddDigSum , evenDigSum = 0 , 0
    for i in range ( n ) :
        if i % 2 == 0 :
            oddDigSum += ( str ( x ) [ i ] - '0' )
        else :
            evenDigSum += ( str ( x ) [ i ] - '0' )
    return ( ( oddDigSum - evenDigSum ) % 11 == 0 )

