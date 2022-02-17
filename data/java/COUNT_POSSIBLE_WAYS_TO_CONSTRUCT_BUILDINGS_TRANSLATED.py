====================
def count_possible_ways_to_construct_buildings ( N ) :
    if N == 1 :
        return 4
    count_b , count_s , prev_count_b , prev_count_s = 1 , 1 , 1 , 1
    for i in range ( 2 , N + 1 ) :
        prev_count_b , prev_count_s = count_b , prev_count_s , count_s
        count_s = prev_count_b + prev_count_s
        count_b = prev_count_s
    result = count_s + count_b
    return ( result * result )

