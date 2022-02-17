====================
def number_of_pairs_in_an_array_havING_SUM_EQUAL_TO_PRODUCT ( a , n ) :
    zero , two = 0 , 0
    for i in range ( n ) :
        if a [ i ] == 0 : zero += 1
        if a [ i ] == 2 : two += 1
    cnt = ( zero * ( zero - 1 ) ) / 2 + ( two * ( two - 1 ) ) / 2
    return cnt

