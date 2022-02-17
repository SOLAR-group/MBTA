====================
def add_1_to_a_given_number ( x ) :
    m = 1
    while int ( x & m ) >= 1 :
        x = x ^ m
        m <<= 1
    x = x ^ m
    return x

