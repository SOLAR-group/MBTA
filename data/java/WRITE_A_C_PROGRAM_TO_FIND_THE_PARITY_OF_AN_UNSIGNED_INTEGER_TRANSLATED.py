====================
def write_a_c_program_to_find_the_parity_of_an_unsigned_integer ( n ) :
    parity = False
    while n != 0 :
        parity = not parity
        n = n & ( n - 1 )
    return parity

