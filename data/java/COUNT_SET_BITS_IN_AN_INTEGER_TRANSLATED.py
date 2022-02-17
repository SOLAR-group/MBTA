====================
def count_set_bits_in_an_integer ( n ) :
    count = 0
    while n :
        count += n & 1
        n >>= 1
    return count

