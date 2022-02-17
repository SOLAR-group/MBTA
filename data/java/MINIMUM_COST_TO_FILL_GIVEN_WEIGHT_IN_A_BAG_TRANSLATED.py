====================
def MINIMUM_COST_TO_FILL_GIVEN_WEIGHT_IN_A_BAG ( cost , n , W ) :
    val = [ ]
    wt = [ ]
    size = 0
    for i in range ( n ) :
        if cost [ i ] != - 1 :
            val.append ( cost [ i ] )
            wt.append ( i + 1 )
            size += 1
    n = size
    min_cost = [ ]
    for i in range ( n + 1 ) :
        min_cost.append ( int ( cost [ i ] ) )
        wt.append ( i + 1 )
        size += 1
    min_cost = [ ]
    for i in range ( 0 , W + 1 ) :
        min_cost.append ( int ( cost [ i ] ) )
    for i in range ( 1 , n + 1 ) :
        min_cost.append ( 0 )
    for i in range ( 1 , n + 1 ) :
        for j in range ( 1 , W + 1 ) :
            if wt [ i - 1 ] > j :
                min_cost.append ( min_cost [ i - 1 ] [ j ] )
            else :
                min_cost.append ( min ( min_cost [ i - 1 ] [ j ] , min_cost [ i ] [ j - wt [ i - 1 ] ] + val [ i - 1 ] ) )
    return ( min_cost [ n ] [ W ] if W > 0 else - 1 )

