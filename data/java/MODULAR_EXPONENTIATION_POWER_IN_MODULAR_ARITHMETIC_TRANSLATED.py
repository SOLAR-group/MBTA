====================
def f_gold ( x , y , p ) :
    res = 1
    x = x % p
    while y :
        if ( y & 1 ) == 1 :
            res = ( res * x ) % p
        y = y >> 1
        x = ( x * x ) % p
    return res

