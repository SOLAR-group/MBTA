====================
def count_number_of_ways_to_cover_a_distance_1 ( dist ) :
    count = [ 1 , 1 , 2 , 2 ]
    for i in range ( 3 , dist + 1 ) :
        count.append ( count [ i - 1 ] + count [ i - 2 ] + count [ i - 3 ] )
    return count

