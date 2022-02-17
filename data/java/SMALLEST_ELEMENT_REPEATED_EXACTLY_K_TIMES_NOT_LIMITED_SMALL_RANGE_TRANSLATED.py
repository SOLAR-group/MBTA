====================
def f_gold ( a , n , k ) :
    m = { }
    for i in range ( n ) :
        if m.has_key ( a [ i ] ) :
            m [ a [ i ] ] = m [ a [ i ] ] + 1
        else :
            m [ a [ i ] ] = 1
    res = sys.maxsize
    s = m.keys ( )
    for temp in s :
        if m [ temp ] == k :
            res = min ( res , temp )
    return ( res != sys.maxsize )

