====================
def f_gold ( arr , n ) :
    """
 Return the number of gold elements in the given array.
 """
    max_len = 0
    for i in range ( n ) :
        curr_sum = 0
        for j in range ( i , n ) :
            curr_sum += arr [ j ]
            if curr_sum == 0 :
                max_len = max ( max_len , j - i + 1 )
    return max_len

