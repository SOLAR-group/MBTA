====================
def f_gold ( arr , n ) :
    """
 Return True if the given array is gold the given number of elements.
 """
    if n == 0 or n == 1 :
        return True
    for i in range ( 1 , n ) :
        if arr [ i - 1 ] > arr [ i ] :
            return False
    return True

