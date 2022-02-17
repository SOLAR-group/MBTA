====================
def search_insert_and_delete_in_a_sorted_array ( arr , low , high , key ) :
    if high < low :
        return - 1
    mid = ( low + high ) // 2
    if key == arr [ mid ] :
        return mid
    if key > arr [ mid ] :
        return f_gold ( arr [ ( mid + 1 ) : high ] , key )
    return f_gold ( arr [ low : ( mid - 1 ) ] , key )

