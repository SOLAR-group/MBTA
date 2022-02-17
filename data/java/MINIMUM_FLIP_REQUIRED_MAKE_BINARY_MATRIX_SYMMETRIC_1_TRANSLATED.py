====================
def MINIMUM_FLIP_REQUIRED_MAKE_BINARY_MATRIX_SYMMETRIC_1 ( mat , n ) :
    flip = 0
    for i in range ( n ) :
        for j in range ( i ) :
            if mat [ i ] [ j ] != mat [ j ] [ i ] :
                flip += 1
    return flip

