====================
def f_gold ( arr , n ) :
    hash = { }
    for i in range ( n ) :
        if hash.has_key ( arr [ i ] ) :
            hash [ arr [ i ] ] = hash [ arr [ i ] ] + 1
        else :
            hash [ arr [ i ] ] = 1
    max_count = 0
    s = hash.keys ( )
    for i in s :
        if max_count < hash [ i ] :
            max_count = hash [ i ]
    return ( n - max_count )

