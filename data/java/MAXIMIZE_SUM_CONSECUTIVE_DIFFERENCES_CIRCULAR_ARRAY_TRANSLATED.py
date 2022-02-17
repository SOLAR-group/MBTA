====================
def f_gold ( arr , n ) :
    """
 Return the sum of the gold values of the given array.

 Parameters
 -----
 arr : array_like
 The array to compute the sum of.
 n : int
 The number of values to compute.

 Returns
 -----
 sum : int
 The sum of the gold values of the given array.
 """
    sum = 0
    arr = np.asarray ( arr )
    for i in range ( n // 2 ) :
        sum -= ( 2 * arr [ i ] )
        sum += ( 2 * arr [ n - i - 1 ] )
    return sum

