====================
def f_gold ( arr , n ) :
    mp = { }
    for i in range ( n ) :
        mp [ arr [ i ] ] = mp [ arr [ i ] ] if i in mp else 1
    res = 0
    for k , v in mp.items ( ) :
        res = max ( res , v )
    return res

