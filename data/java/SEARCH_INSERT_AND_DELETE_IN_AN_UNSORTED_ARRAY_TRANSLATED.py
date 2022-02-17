====================
def search_insert_and_delete_in_an_unsorted_array ( arr , n , key ) :
    for i in range ( n ) :
        if arr [ i ] == key :
            return i
    return - 1

