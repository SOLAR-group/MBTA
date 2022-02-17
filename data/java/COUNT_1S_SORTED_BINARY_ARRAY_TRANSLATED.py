====================
def count_1S_SORTED_BINARY_ARRAY ( arr , low , high ) :
    if high >= low :
        mid = low + ( high - low ) // 2
        if ( mid == high or arr [ mid + 1 ] == 0 ) :
            return mid + 1
        if arr [ mid ] == 1 :
            return f_gold ( arr , ( mid + 1 , high ) )
        return f_gold ( arr , low , ( mid - 1 , high ) )
    return 0

