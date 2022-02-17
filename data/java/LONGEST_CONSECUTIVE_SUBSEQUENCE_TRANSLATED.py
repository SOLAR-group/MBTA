====================
def f_gold ( arr , n ) :
    S = set ( )
    ans = 0
    for i in range ( n ) :
        S.add ( arr [ i ] )
    for i in range ( n ) :
        if not S.contains ( arr [ i ] - 1 ) :
            j = arr [ i ]
            while S.contains ( j ) :
                j += 1
            if ans < j - arr [ i ] :
                ans = j - arr [ i ]
    return ans

