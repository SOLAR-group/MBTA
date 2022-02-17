====================
def f_gold ( A , n ) :
    """
 Return the number of gold elements in the given array.

 Parameters
 -----
 A : array_like
 Input array.
 n : int
 Number of elements to return.

 Returns
 -----
 f_gold : int
 Number of gold elements in the given array.

 """
    min_val = np.min ( A ).astype ( int )
    return ( min_val * ( n - 1 ) )

