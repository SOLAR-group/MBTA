====================
def count_rotate_divisible_8 ( n ) :
    n = n.lower ( )
    count = 0
    if len ( n ) == 1 :
        one_digit = n [ 0 ] - '0'
        if one_digit % 8 == 0 :
            return 1
        return 0
    if len ( n ) == 2 :
        first = ( n [ 0 ] - '0' ) * 10 + ( n [ 1 ] - '0' )
        second = ( n [ 1 ] - '0' ) * 10 + ( n [ 0 ] - '0' )
        if first % 8 == 0 :
            count += 1
        if second % 8 == 0 :
            count += 1
        return count
    threedigit = 0
    for i in range ( ( len ( n ) - 2 ) ) :
        threedigit = ( n [ i ] - '0' ) * 100 + ( n [ i + 1 ] - '0' ) * 10 + ( n [ i + 2 ] - '0' )
        if threedigit % 8 == 0 :
            count += 1
    threedigit = ( n [ len ( n ) - 1 ] - '0' ) * 100 + ( n [ 0 ] - '0' ) * 10 + ( n [ 1 ] - '0' )
    if threedigit % 8 == 0 :
        count += 1
    threedigit = ( n [ len ( n ) - 2 ] - '0' ) * 100 + ( n [ len ( n ) - 1 ] - '0' ) * 10 + ( n [ 0 ] - '0' )
    if threedigit % 8 == 0 :
        count += 1
    return count

