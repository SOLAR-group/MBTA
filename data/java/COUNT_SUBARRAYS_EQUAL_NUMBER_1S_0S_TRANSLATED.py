====================
def count_subarrays_equal_number_1s_0s ( arr , n ) :
    um = { }
    curr_sum = 0
    for i in range ( n ) :
        curr_sum += ( arr [ i ] == 0 )
        um [ curr_sum ] = um [ curr_sum ] if curr_sum > 1 else 1
    count = 0
    for itr , val in enumerate ( um ) :
        if val > 1 :
            count += ( ( val * ( val - 1 ) ) / 2 )
    if um.has_key ( 0 ) :
        count += um [ 0 ]
    return count

