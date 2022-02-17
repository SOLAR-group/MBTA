====================
def f_gold ( m , x , revenue , n , t ) :
    max_rev = [ 0 ] * m + [ 0 ] * m
    nxtbb = 0
    for i in range ( m + 1 ) :
        max_rev [ i ] = 0
    nxtbb = 0
    for i in range ( 1 , m + 1 ) :
        if nxtbb < n :
            if x [ nxtbb ] != i :
                max_rev [ i ] = max_rev [ i - 1 ]
            else :
                if i <= t :
                    max_rev [ i ] = max ( max_rev [ i - 1 ] , revenue [ nxtbb ] )
                else :
                    max_rev [ i ] = max ( max_rev [ i - t - 1 ] + revenue [ nxtbb ] , max_rev [ i - 1 ] )
                nxtbb += 1
        else :
            max_rev [ i ] = max_rev [ i - 1 ]
    return max_rev [ m ]

