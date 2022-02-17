====================
def get_sequence_of_sequence_of_same_same_elements_1 ( m , n ) :
    if m < n :
        return 0
    if n == 0 :
        return 1
    return f_gold ( m - 1 , n ) + f_gold ( m / 2 , n - 1 )

