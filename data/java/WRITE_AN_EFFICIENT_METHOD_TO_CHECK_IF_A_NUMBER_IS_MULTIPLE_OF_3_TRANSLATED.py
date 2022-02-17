====================
def write_an_efficient_method_to_check_if_a_number_is_multiple_of_3 ( n ) :
    odd_count = 0
    even_count = 0
    if n < 0 :
        n = - n
    if n == 0 :
        return 1
    if n == 1 :
        return 0
    while n != 0 :
        if ( n & 1 ) :
            odd_count += 1
        if ( n & 2 ) :
            even_count += 1
        n = n >> 2
    return f_gold ( abs ( odd_count - even_count ) )

