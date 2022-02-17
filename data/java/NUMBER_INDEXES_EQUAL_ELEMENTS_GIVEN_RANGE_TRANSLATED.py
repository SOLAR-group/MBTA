====================
def number_indexes_equal_ELEMENTS_GIVEN_RANGE ( a , n , l , r ) :
    count = 0
    for i in range ( l , r ) :
        if a [ i ] == a [ i + 1 ] :
            count += 1
    return count

