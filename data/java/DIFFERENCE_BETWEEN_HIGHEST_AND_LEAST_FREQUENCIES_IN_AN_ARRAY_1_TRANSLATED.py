====================
def f_gold ( arr , n ) :
    mp = { }
    for i in range ( n ) :
        if mp.has_key ( arr [ i ] ) :
            mp [ arr [ i ] ] = mp [ arr [ i ] ] + 1
        else :
            mp [ arr [ i ] ] = 1
    max_count , min_count = 0 , n
    for x , y in mp.items ( ) :
        max_count = max ( max_count , x )
        min_count = min ( min_count , y )
    return ( max_count - min_count )

