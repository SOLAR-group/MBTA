====================
def f_gold ( str ) :
    res = str [ 0 ] - '0'
    for i in range ( 1 , len ( str ) ) :
        if str [ i ] == '0' or str [ i ] == '1' or res < 2 :
            res += ( str [ i ] - '0' )
        else :
            res *= ( str [ i ] - '0' )
    return res

