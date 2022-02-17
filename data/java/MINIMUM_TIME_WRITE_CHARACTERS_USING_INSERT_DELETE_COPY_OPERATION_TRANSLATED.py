====================
def f_gold ( N , insert , remove , copy ) :
    if N == 0 :
        return 0
    if N == 1 :
        return insert
    dp = [ 0 ] * ( N + 1 )
    for i in range ( 1 , N + 1 ) :
        if i % 2 == 0 :
            dp [ i ] = min ( dp [ i - 1 ] + insert , dp [ i / 2 ] + copy )
        else :
            dp [ i ] = min ( dp [ i - 1 ] + insert , dp [ ( i + 1 ) / 2 ] + copy + remove )
    return dp [ N ]

