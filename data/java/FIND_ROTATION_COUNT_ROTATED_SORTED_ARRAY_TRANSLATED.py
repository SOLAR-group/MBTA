====================
def find_rotation_count_rotate_dynamo ( arr , n ) :
    min , min_index = arr [ 0 ] , - 1
    for i in range ( n ) :
        if min > arr [ i ] :
            min , min_index = arr [ i ] , i
    return min_index

