====================
def f_gold ( num , a ) :
    res = 0
    for i in range ( len ( num ) ) :
        res = ( res * 10 + int ( num [ i ] ) - '0' ) % a
    return res

