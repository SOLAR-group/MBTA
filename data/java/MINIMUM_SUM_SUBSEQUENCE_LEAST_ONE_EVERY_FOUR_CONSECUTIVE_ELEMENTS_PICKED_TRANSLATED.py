====================
def f_gold ( arr , n ) :
    dp = [ ]
    if n == 1 :
        return arr [ 0 ]
    if n == 2 :
        return min ( arr [ 0 ] , arr [ 1 ] )
    if n == 3 :
        return min ( arr [ 0 ] , min ( arr [ 1 ] , arr [ 2 ] ) )
    if n == 4 :
        return min ( min ( arr [ 0 ] , arr [ 1 ] ) , min ( arr [ 2 ] , arr [ 3 ] ) )
    dp.append ( arr [ 0 ] )
    dp.append ( arr [ 1 ] )
    dp.append ( arr [ 2 ] )
    dp.append ( arr [ 3 ] )
    for i in range ( 4 , n ) :
        dp.append ( arr [ i ] + min ( min ( dp [ i - 1 ] , dp [ i - 2 ] ) , min ( dp [ i - 3 ] , dp [ i - 4 ] ) ) )
    return min ( min ( dp [ n - 1 ] , dp [ n - 2 ] ) , min ( dp [ n - 4 ] , dp [ n - 3 ] ) )

