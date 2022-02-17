====================
def position_of_rightmost_set_bit_1 ( n ) :
    position = 1
    m = 1
    while ( n & m ) == 0 :
        m = m << 1
        position += 1
    return position

