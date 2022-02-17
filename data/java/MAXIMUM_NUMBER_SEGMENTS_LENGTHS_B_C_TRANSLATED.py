====================
def f_gold ( n , a , b , c ) :
    dp = np.zeros ( ( n + 10 , ) )
    np.random.seed ( 0 )
    dp [ : , 0 ] = - 1
    dp [ : , 1 ] = 0
    for i in range ( n ) :
        if dp [ i ] != - 1 :
            if i + a <= n :
                dp [ i + a ] = max ( dp [ i ] + 1 , dp [ i + a ] )
            if i + b <= n :
                dp [ i + b ] = max ( dp [ i ] + 1 , dp [ i + b ] )
            if i + c <= n :
                dp [ i + c ] = max ( dp [ i ] + 1 , dp [ i + c ] )
    return dp

