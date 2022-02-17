====================
def find_rotation_count_rotate_dd_array ( arr , low , high ) :
    if high < low :
        return 0
    if high == low :
        return low
    mid = low + ( high - low ) // 2
    if mid < high and arr [ mid + 1 ] < arr [ mid ] :
        return ( mid + 1 )
    if mid > low and arr [ mid ] < arr [ mid - 1 ] :
        return mid
    if arr [ high ] > arr [ mid ] :
        return mid
    return f_gold ( arr , low , mid - 1 )

