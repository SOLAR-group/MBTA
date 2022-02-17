====================
def f_gold ( n ) :
    dp = np.zeros ( ( 10 , n + 1 ) )
    for i in range ( 10 ) :
        dp [ i , 1 ] = 1
    for digit in range ( 0 , 9 ) :
        for len in range ( 2 , n + 1 ) :
            for x in range ( 0 , digit ) :
                dp [ digit , len ] += dp [ x , len - 1 ]
    count = 0
    for i in range ( 10 ) :
        count += dp [ i , n ]
    return count

