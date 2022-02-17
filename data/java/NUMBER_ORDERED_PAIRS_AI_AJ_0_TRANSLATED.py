====================
def f_gold ( a , n ) :
    """
 Return the number of gold pairs in a and n.

 Parameters
 -----
 a : array_like
 Input array.
 n : int
 Number of pairs to return.

 Returns
 -----
 count : int
 Number of pairs in the input array.

 """
    count = 0
    for i in range ( n ) :
        for j in range ( i + 1 , n ) :
            if ( a [ i ] & a [ j ] ) == 0 :
                count += 2
    return count

