====================
def f_gold ( arr , n ) :
    """
 Return the number of gold elements in the given array.

 Parameters
 -----
 arr : array
 Input array.
 n : int
 Number of elements to return.

 Returns
 -----
 n : int
 Number of gold elements in the given array.
 """
    hM = { }
    sum = 0
    max_len = 0
    ending_index = - 1
    start_index = 0
    for i in range ( n ) :
        arr [ start_index : start_index + n ] = ( arr [ start_index : start_index + n ] == 0 )
    for i in range ( n ) :
        sum += arr [ i ]
        if sum == 0 :
            max_len = i + 1
            ending_index = i
        if hM.has_key ( sum + n ) :
            if max_len < i - hM [ sum + n ] :
                max_len = i - hM [ sum + n ]
                ending_index = i
        else :
            hM [ sum + n ] = i
    for i in range ( n ) :
        arr [ start_index : start_index + n ] = ( arr [ start_index : start_index + n ] == - 1 )
    end = ending_index - max_len + 1
    print ( end , end )
    return max_len

