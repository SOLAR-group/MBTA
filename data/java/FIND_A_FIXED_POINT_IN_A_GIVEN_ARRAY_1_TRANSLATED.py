====================
def find_a_fixed_point_in_a_given_array_1 ( arr , low , high ) :
    if high >= low :
        mid = ( low + high ) // 2
        if mid == arr [ mid ] :
            return mid
        if mid > arr [ mid ] :
            return f_gold ( arr , ( mid + 1 ) , high )
        else :
            return f_gold ( arr , low , ( mid - 1 ) )
    return - 1

