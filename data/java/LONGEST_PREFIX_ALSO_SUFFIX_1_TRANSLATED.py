====================
def f_gold ( s ) :
    n = len ( s )
    lps = [ 0 ] * n
    len = 0
    i = 1
    while i < n :
        if s [ i ] == s [ len ( s ) ] :
            len += 1
            lps [ i ] = len
            i += 1
        else :
            if len != 0 :
                len = lps [ len - 1 ]
            else :
                lps [ i ] = 0
                i += 1
    res = lps [ - 1 ]
    return ( res > n / 2 )

