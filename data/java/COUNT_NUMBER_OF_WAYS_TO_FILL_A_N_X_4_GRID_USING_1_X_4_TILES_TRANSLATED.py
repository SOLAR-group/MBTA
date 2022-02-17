====================
def f_gold ( n ) :
    dp = [ 0 ] * n + [ 0 ] * n
    for i in range ( 1 , n + 1 ) :
        if i >= 1 and i <= 3 :
            dp [ i ] = 1
        elif i == 4 :
            dp [ i ] = 2
        else :
            dp [ i ] = dp [ i - 1 ] + dp [ i - 4 ]
    return dp [ n ]

