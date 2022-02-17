====================
def f_gold ( a , n , k ) :
    b = { }
    for i in range ( n ) :
        x = a [ i ]
        d = min ( 1 + i , n - i )
        if not b.has_key ( x ) :
            b [ x ] = d
        else :
            b [ x ] = min ( d , b [ x ] )
    ans = float ( 'inf' )
    for i in range ( n ) :
        x = a [ i ]
        if x != k - x and b.has_key ( k - x ) :
            ans = min ( max ( b [ x ] , b [ k - x ] ) , ans )
    return ans

