====================
def f_gold ( n ) :
    """
 Return the gold string of the given number.

 Parameters
 -----
 n : str
 The number to be converted.

 Returns
 -----
 res : str
 The gold string of the given number.
 """
    res = n
    for j in range ( len ( n ) - 1 , - 1 , - 1 ) :
        res += n [ j ]
    return res

