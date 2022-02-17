====================
def f_gold ( arr , n ) :
    min_prefix_sum = 0
    res = int ( '-1' )
    prefix_sum = [ arr [ 0 ] ]
    for i in range ( 1 , n ) :
        prefix_sum [ i ] = prefix_sum [ i - 1 ] + arr [ i ]
    for i in range ( 0 , n ) :
        res = max ( res , prefix_sum [ i ] - min_prefix_sum )
        min_prefix_sum = min ( min_prefix_sum , prefix_sum [ i ] )
    return res

