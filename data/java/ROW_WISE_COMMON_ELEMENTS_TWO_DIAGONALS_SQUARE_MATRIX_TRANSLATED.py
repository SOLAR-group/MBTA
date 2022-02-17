====================
def f_gold ( mat , n ) :
    """
 Return the number of gold elements in a matrix.

 Parameters
 -----
 mat : array_like
 Matrix to be tested.
 n : int
 Number of elements in the matrix.

 Returns
 -----
 res : int
 Number of gold elements in the matrix.

 """
    res = 0
    for i in range ( n ) :
        if mat [ i ] [ i ] == mat [ i ] [ n - i - 1 ] :
            res += 1
    return res

