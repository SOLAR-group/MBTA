====================
def check_LARGE_NUMBER_DIVISIBLE_13_NOT ( num ) :
    length = len ( num )
    if length == 1 and num [ 0 ] == '0' :
        return True
    if length % 3 == 1 :
        num += '00'
        length += 2
    elif length % 3 == 2 :
        num += '0'
        length += 1
    sum , p = 0 , 1
    for i in range ( length - 1 , - 1 , - 1 ) :
        group = 0
        group += num [ i ] - '0'
        group += ( num [ i ] - '0' ) * 10
        group += ( num [ i ] - '0' ) * 100
        sum = sum + group * p
        p *= ( - 1 )
    sum = abs ( sum )
    return ( sum % 13 == 0 )

