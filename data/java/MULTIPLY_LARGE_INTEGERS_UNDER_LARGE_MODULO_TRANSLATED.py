====================
def import ( a , b , mod ) :
    res = 0
    a %= mod
    while b :
        if ( b & 1 ) :
            res = ( res + a ) % mod
        a = ( 2 * a ) % mod
        b >>= 1
    return res

