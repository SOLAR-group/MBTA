====================
def f_gold ( a , b , n , m ) :
    count_a = { }
    count_b = { }
    for i in range ( n ) :
        if count_a.has_key ( a [ i ] ) :
            count_a [ a [ i ] ] = count_a [ a [ i ] ] + 1
        else :
            count_a [ a [ i ] ] = 1
    for i in range ( m ) :
        if count_b.has_key ( b [ i ] ) :
            count_b [ b [ i ] ] = count_b [ b [ i ] ] + 1
        else :
            count_b [ b [ i ] ] = 1
    res = 0
    s = count_a.keys ( )
    for x in s :
        if count_b.has_key ( x ) :
            res += min ( count_b [ x ] , count_a [ x ] )
    return res

