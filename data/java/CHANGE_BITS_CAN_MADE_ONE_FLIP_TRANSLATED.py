====================
def change_bits_can_made_one_flip ( str ) :
    zeros , ones = 0 , 0
    for ch in str :
        if ch == '0' :
            zeros += 1
        else :
            ones += 1
    return ( zeros , ones )

