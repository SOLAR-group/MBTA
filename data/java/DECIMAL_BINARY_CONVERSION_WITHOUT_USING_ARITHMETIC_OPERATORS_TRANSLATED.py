====================
def decimal_binary_conserve_without_using_arithmetic_operators ( n ) :
    if n == 0 :
        return '0'
    bin = ''
    while n :
        bin = ( ( n & 1 ) if n > 0 else '0' ) + bin
        n >>= 1
    return bin

