====================
def length_longest_strict_bitonic_subsequence ( arr , n ) :
    inc = { }
    dcr = { }
    len_inc = [ ]
    len_dcr = [ ]
    long_len = 0
    for i in range ( n ) :
        len = 0
        if inc.has_key ( arr [ i ] - 1 ) :
            len = inc [ arr [ i ] - 1 ]
        len_inc.append ( len + 1 )
        inc [ arr [ i ] ] = len_inc
    for i in range ( n - 1 , - 1 , - 1 ) :
        len = 0
        if dcr.has_key ( arr [ i ] - 1 ) :
            len = dcr [ arr [ i ] - 1 ]
        len_dcr.append ( len + 1 )
        dcr [ arr [ i ] ] = len_dcr
    for i in range ( n ) :
        if long_len < ( len_inc + len_dcr [ i ] - 1 ) :
            long_len = len_inc + len_dcr [ i ] - 1
    return long_len

