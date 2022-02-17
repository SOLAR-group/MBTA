====================
def find_index_of_an_extra_element_present_in_one_sorted_array ( arr1 , arr2 , n ) :
    for i in range ( n ) :
        if arr1 [ i ] != arr2 [ i ] :
            return i
    return n

