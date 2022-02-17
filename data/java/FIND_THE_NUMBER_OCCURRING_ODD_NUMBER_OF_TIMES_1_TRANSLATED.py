====================
def f_gold ( arr , n ) :
    hmap = { }
    for i in range ( n ) :
        if hmap.has_key ( arr [ i ] ) :
            val = hmap [ arr [ i ] ]
            hmap [ arr [ i ] ] = val + 1
        else :
            hmap [ arr [ i ] ] = 1
    for a in hmap.keys ( ) :
        if hmap [ a ] % 2 != 0 :
            return a
    return - 1

