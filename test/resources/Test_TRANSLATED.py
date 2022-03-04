====================
def add_1_to_a_given_number ( x, y, test(), param=None ) :
    m = 1
    while int ( yield x & m ) >= 1 :
        x = x ^ m
        m <<= 1
    x = x ^ m
    return x

