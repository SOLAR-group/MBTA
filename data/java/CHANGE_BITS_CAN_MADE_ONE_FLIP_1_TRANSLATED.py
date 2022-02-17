====================
def change_bits_can_made_one_flip_1 ( str ) :
    sum = 0
    n = len ( str )
    for i in range ( n ) :
        sum += str [ i ] - '0'
    return ( sum == n - 1 or sum == 1 )

