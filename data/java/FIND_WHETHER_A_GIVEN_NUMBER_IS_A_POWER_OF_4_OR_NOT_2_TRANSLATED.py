====================
def f_gold ( n ) :
    return n != 0 and ( ( n & ( n - 1 ) ) == 0 ) and ( n & 0xAAAAAAAA ) == 0

