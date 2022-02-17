====================
def f_gold ( arr , n ) :
    """
 Return True if the number of elements in arr is the gold number.
 """
    remainder = 0
    for i in range ( n ) :
        remainder = ( remainder + arr [ i ] ) % 3
    return ( remainder == 0 )

