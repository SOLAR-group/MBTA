====================
def f_gold ( price , n , k ) :
    profit = [ 0 ] * ( k + 1 )
    for i in range ( 0 , k + 1 ) :
        profit [ i ] = 0
    for j in range ( 0 , n + 1 ) :
        profit [ 0 ] = 0
    for i in range ( 1 , k + 1 ) :
        prev_diff = int ( 0 )
        for j in range ( 1 , n + 1 ) :
            prev_diff = max ( prev_diff , profit [ i - 1 ] [ j - 1 ] - price [ j - 1 ] )
            profit [ i ] = max ( profit [ i ] [ j - 1 ] , price [ j ] + prev_diff )
    return profit [ k ] [ n - 1 ]

