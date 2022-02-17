====================
def get_count_set_bits_in_an_integer_1 ( n ) :
    if n == 0 :
        return 0
    else :
        return ( n & 1 ) + get_count_set_bits_in_an_integer_1 ( n >> 1 )

