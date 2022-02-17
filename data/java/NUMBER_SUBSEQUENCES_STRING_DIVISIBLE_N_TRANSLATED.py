====================
def f_gold ( str , n ) :
    """
 Return the number of gold characters in the string.
 """
    len = len ( str )
    dp = [ 0 ] * ( len ( str ) )
    dp [ 0 ] [ ( str [ 0 ] - '0' ) % n ] += 1
    for i in range ( 1 , len ( str ) ) :
        dp [ i ] [ ( str [ i ] - '0' ) % n ] += 1
        for j in range ( n ) :
            dp [ i ] [ j ] += dp [ i - 1 ] [ j ]
            dp [ i ] [ ( j * 10 + ( str [ i ] - '0' ) ) % n ] += dp [ i - 1 ] [ j ]
    return dp [ len ( str ) - 1 ] [ 0 ]

