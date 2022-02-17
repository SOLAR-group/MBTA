====================
def f_gold ( arr , n ) :
    S = set ( )
    for i in range ( n ) :
        S.add ( arr [ i ] )
    ans = 0
    for i in range ( n ) :
        if S.intersection ( arr [ i ] ) :
            j = arr [ i ]
            while S.intersection ( j ) :
                j += 1
            ans = max ( ans , j - arr [ i ] )
    return ans

