====================
def f_gold ( arr , n ) :
    d = { }
    max_dist = 0
    for i in range ( n ) :
        if not d.has_key ( arr [ i ] ) :
            d [ arr [ i ] ] = i
        else :
            max_dist = max ( max_dist , i - d [ arr [ i ] ] )
    return max_dist

