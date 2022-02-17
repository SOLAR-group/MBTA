====================
def DYNAMIC_PROGRAMMING_SET_8_MATRIX_CHAIN_MULTIPLICATION ( p , i , j ) :
    if i == j :
        return 0
    min = sys.maxint
    for k in range ( i , j ) :
        count = f_gold ( p , i , k ) + f_gold ( p , k + 1 , j ) + p [ i - 1 ] * p [ k ] * p [ j ]
        if count < min :
            min = count
    return min

