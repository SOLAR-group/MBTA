====================
def program_binary_decimal_conversion ( n ) :
    num = n
    dec_value = 0
    base = 1
    temp = num
    while temp > 0 :
        last_digit = temp % 10
        temp = temp / 10
        dec_value += last_digit * base
        base = base * 2
    return dec_value

