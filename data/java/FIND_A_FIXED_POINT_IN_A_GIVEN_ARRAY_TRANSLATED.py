====================
def find_a_fixed_point_in_a_given_array ( arr , n ) :
    i = 0
    for i in range ( n ) :
        if arr [ i ] == i :
            return i
    return - 1

