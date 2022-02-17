====================
def f_gold ( str ) :
    n = len ( str )
    dp = [ 0 ] * n + [ 0 ] * n + [ 0 ] * n
    for i in range ( 0 , n ) :
        for j in range ( 0 , n ) :
            dp [ i ] [ j ] = 0
    for i in range ( 1 , n ) :
        for j in range ( 1 , n ) :
            if str [ i - 1 ] == str [ j - 1 ] and i != j :
                dp [ i ] [ j ] = 1 + dp [ i - 1 ] [ j - 1 ]
            else :
                dp [ i ] [ j ] = max ( dp [ i ] [ j - 1 ] , dp [ i - 1 ] [ j ] )
    res = ""
    i , j = n , n
    while i > 0 and j > 0 :
        if dp [ i ] [ j ] == dp [ i - 1 ] [ j - 1 ] + 1 :
            res = res + str [ i - 1 ]
            i -= 1
            j -= 1
        elif dp [ i ] [ j ] == dp [ i - 1 ] [ j ] :
            i -= 1
        else :
            j -= 1
    reverse = ""
    for k in range ( len ( res ) - 1 , - 1 , - 1 ) :
        reverse = reverse + res [ k ]
    return reverse

