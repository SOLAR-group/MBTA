====================
def remove_minimum_ELEMENTS_EITHER_SIDE_2MIN_MAX ( arr , n ) :
    longest_start , longest_end = - 1 , 0
    for start in range ( n ) :
        min , max = int ( arr [ start ] ) , int ( arr [ start + 1 ] )
        for end in range ( start , n ) :
            val = arr [ end ]
            if val < min : min = val
            if val > max : max = val
            if 2 * min <= max : break
            if end - start > longest_end - longest_start or longest_start == - 1 :
                longest_start = start
                longest_end = end
    if longest_start == - 1 : return n
    return ( n - ( longest_end - longest_start + 1 ) )

