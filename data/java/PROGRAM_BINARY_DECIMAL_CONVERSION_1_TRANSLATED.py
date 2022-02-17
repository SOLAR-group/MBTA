====================
def program_binary_decimal_conversion_1 ( n ) :
    num = n
    dec_value = 0
    base = 1
    len ( num )
    for i in range ( len ( num ) - 1 , - 1 , - 1 ) :
        if num [ i ] == '1' :
            dec_value += base
        base = base * 2
    return dec_value

