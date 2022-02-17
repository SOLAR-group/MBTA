====================
def f_gold ( x ) :
    """
 Return the next higher number with the same bit set as x.
 """
    right_one , next_higher_one_bit , right_ones_pattern , next = x
    if next_higher_one_bit :
        right_one = x & - x
        next_higher_one_bit = x + right_one
        right_ones_pattern = x ^ next_higher_one_bit
        right_ones_pattern = ( right_ones_pattern ) // right_one
        right_ones_pattern >>= 2
        next = next_higher_one_bit | right_ones_pattern
    return next

