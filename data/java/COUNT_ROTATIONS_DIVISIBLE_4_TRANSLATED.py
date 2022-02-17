====================
def count_rotate_divisible_4 ( n ) :
    n = n.split ( ' ' )
    if len ( n ) == 1 :
        one_digit = n [ 0 ] - '0'
    else :
        one_digit = n [ 0 ]
    two_digit , count = 0 , 0
    for i in range ( ( len ( n ) - 1 ) ) :
        two_digit = ( n [ i ] - '0' ) * 10 + ( n [ i + 1 ] - '0' )
        if two_digit % 4 == 0 :
            count += 1
    two_digit = ( n [ len ( n ) - 1 ] - '0' ) * 10 + ( n [ 0 ] - '0' )
    if two_digit % 4 == 0 :
        count += 1
    return count

