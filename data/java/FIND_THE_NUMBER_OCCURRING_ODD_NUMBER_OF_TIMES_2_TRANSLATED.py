====================
def find_the_number_occurrend_number_of_times_2 ( ar , ar_size ) :
    i = 0
    res = 0
    for i in range ( ar_size ) :
        res = res ^ ar [ i ]
    return res

