====================
def f_gold ( arr , n , k ) :
    h = { }
    for i in range ( n ) :
        if h.has_key ( arr [ i ] ) :
            h [ arr [ i ] ] = h [ arr [ i ] ] + 1
        else :
            h [ arr [ i ] ] = 1
    if len ( h ) < k :
        return - 1
    dist_count = 0
    for i in range ( n ) :
        if h [ arr [ i ] ] == 1 :
            dist_count += 1
        if dist_count == k :
            return arr [ i ]
    return - 1

