====================
def PROGRAM_TO_CHECK_IF_A_MATRIX_IS_SYMMETRIC ( mat , N ) :
    for i in range ( N ) :
        for j in range ( N ) :
            if mat [ i ] [ j ] != mat [ j ] [ i ] :
                return False
        return True

