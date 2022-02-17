====================
def dice_raise_proBLEM_1 ( f , d , s ) :
    mem = np.zeros ( ( d + 1 , s + 1 ) )
    mem [ 0 , 0 ] = 1
    for i in range ( 1 , d + 1 ) :
        for j in range ( i , s + 1 ) :
            mem [ i , j ] = mem [ i , j - 1 ] + mem [ i - 1 , j - 1 ]
            if j - f - 1 >= 0 :
                mem [ i , j ] -= mem [ i - 1 , j - f - 1 ]
    return mem

