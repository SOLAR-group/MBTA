====================
def f_gold ( n , temple_height ) :
    """
 Return the gold number of temples in the given number of temples.
 """
    sum = 0
    for i in range ( n ) :
        left , right = 0 , 0
        for j in range ( i - 1 , - 1 , - 1 ) :
            if temple_height [ j ] < temple_height [ j + 1 ] :
                left += 1
            else :
                break
        for j in range ( i + 1 , n ) :
            if temple_height [ j ] < temple_height [ j - 1 ] :
                right += 1
            else :
                break
        sum += max ( right , left ) + 1
    return sum

