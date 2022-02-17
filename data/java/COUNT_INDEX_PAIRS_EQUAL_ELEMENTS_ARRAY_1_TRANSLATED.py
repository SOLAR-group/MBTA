====================
def f_gold ( arr , n ) :
    hm = { }
    for i in range ( n ) :
        if hm.has_key ( arr [ i ] ) :
            hm [ arr [ i ] ] = hm [ arr [ i ] ] + 1
        else :
            hm [ arr [ i ] ] = 1
    ans = 0
    for key , count in hm.items ( ) :
        ans += ( count * ( count - 1 ) ) / 2
    return ans

