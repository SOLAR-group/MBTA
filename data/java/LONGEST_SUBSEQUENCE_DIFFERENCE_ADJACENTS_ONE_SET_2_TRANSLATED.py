====================
def f_gold ( arr , n ) :
    um = { }
    long_len = 0
    for i in range ( n ) :
        len = 0
        if um.has_key ( arr [ i ] - 1 ) and len < um [ arr [ i ] - 1 ] :
            len = um [ arr [ i ] - 1 ]
        if um.has_key ( arr [ i ] + 1 ) and len < um [ arr [ i ] + 1 ] :
            len = um [ arr [ i ] + 1 ]
        um [ arr [ i ] ] = len + 1
        if long_len < um [ arr [ i ] ] :
            long_len = um [ arr [ i ] ]
    return long_len

