====================
def f_gold ( n , p ) :
    ans = 0
    for x in range ( 1 , p ) :
        if ( x ** 2 ) % p == 1 :
            last = x + p * ( n // p )
        else :
            last -= p
        ans += ( ( last - x ) // p + 1 )
    return ans

