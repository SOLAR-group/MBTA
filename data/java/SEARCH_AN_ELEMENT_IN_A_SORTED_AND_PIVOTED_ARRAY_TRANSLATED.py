====================
def search_an_element_in_a_Sorted_and_PIVOTED_ARRAY ( arr , l , h , key ) :
    if l > h :
        return - 1
    mid = ( l + h ) // 2
    if arr [ mid ] == key :
        return mid
    if arr [ l ] <= arr [ mid ] :
        if key >= arr [ l ] and key <= arr [ mid ] :
            return f_gold ( arr , l , mid - 1 , key )
        return f_gold ( arr , mid + 1 , h , key )
    if key >= arr [ mid ] and key <= arr [ h ] :
        return f_gold ( arr , mid + 1 , h , key )
    return f_gold ( arr , l , mid - 1 , key )

