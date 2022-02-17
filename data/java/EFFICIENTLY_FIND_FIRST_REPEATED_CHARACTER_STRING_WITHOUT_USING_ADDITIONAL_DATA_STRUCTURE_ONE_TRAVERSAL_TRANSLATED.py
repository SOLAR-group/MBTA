====================
def f_gold ( str ) :
    checker = 0
    for i in range ( len ( str ) ) :
        val = ord ( str [ i ] ) - ord ( 'a' )
        if ( checker & ( 1 << val ) ) > 0 :
            return i
        checker |= ( 1 << val )
    return - 1

