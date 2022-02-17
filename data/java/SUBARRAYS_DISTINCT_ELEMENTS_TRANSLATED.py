====================
def f_gold ( arr , n ) :
    s = set ( )
    j , ans = 0 , 0
    for i in range ( n ) :
        while j < n and not s.issubset ( arr [ j ] ) :
            s.add ( arr [ i ] )
            j += 1
        ans += ( ( j - i ) * ( j - i + 1 ) ) / 2
        s.remove ( arr [ i ] )
    return ans

