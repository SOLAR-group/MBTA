====================
def f_gold ( A , K ) :
    """
 Compute the optimal number of partitions of a matrix.

 Parameters
 -----
 A : (n, n) array_like
 Input matrix.
 K : int
 Number of partitions of the matrix.

 Returns
 -----
 p : (n, n) ndarray
 Partition matrix.

 """
    n = A.shape [ 0 ]
    pre_sum = np.zeros ( ( n + 1 , ) , dtype = np.float )
    pre_sum [ 0 ] = 0
    for i in range ( n ) :
        pre_sum [ i + 1 ] = pre_sum [ i ] + A [ i ]
    dp = np.zeros ( ( n , ) , dtype = np.float )
    sum = 0
    for i in range ( n ) :
        dp [ i ] = ( pre_sum [ n ] - pre_sum [ i ] ) / ( n - i )
    for k in range ( K - 1 ) :
        for i in range ( n ) :
            for j in range ( i + 1 , n ) :
                dp [ i ] = max ( dp [ i ] , ( pre_sum [ j ] - pre_sum [ i ] ) / ( j - i ) + dp [ j ] )
    return dp

