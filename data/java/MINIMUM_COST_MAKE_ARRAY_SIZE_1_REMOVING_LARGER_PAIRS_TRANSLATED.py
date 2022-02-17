====================
def f_gold ( a , n ) :
    """
 Return the number of gold elements in the given array.

 Parameters
 -----
 a : array_like
 Input array.
 n : int
 Number of elements in the output array.

 Returns
 -----
 out : int
 Number of gold elements in the output array.

 """
    min = a [ 0 ]
    for i in range ( 1 , len ( a ) ) :
        if a [ i ] < min :
            min = a [ i ]
    return ( n - 1 ) * min

