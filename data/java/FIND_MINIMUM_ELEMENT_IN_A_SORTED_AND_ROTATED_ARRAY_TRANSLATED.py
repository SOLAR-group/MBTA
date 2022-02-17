====================
def find_minimum_element_in_a_sorted_and_rotate_array ( arr , low , high ) :
    if high < low :
        return arr [ 0 ]
    if high == low :
        return arr [ low ]
    mid = low + ( high - low ) // 2
    if mid < high and arr [ mid + 1 ] < arr [ mid ] :
        return arr [ mid + 1 ]
    if mid > low and arr [ mid ] < arr [ mid - 1 ] :
        return arr [ mid ]
    if arr [ high ] > arr [ mid ] :
        return f_gold ( arr , low , mid - 1 )
    return f_gold ( arr , mid + 1 , high )

