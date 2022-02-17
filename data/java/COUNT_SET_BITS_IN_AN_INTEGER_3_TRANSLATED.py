====================
def count_set_bits_in_an_integer_3 ( n ) :
    if n == 0 :
        return 0
    else :
        return 1 + f_gold ( n & ( n - 1 ) )

