====================
def DYNAMIC_PROGRAMMING_SET_13_CUTTING_A_ROD ( price , n ) :
    val = [ 0 ] * ( n + 1 )
    for i in range ( 1 , n + 1 ) :
        max_val = int ( min ( price [ i ] , price [ i - 1 ] ) )
        for j in range ( i ) :
            max_val = max ( max_val , price [ j ] + val [ i - j - 1 ] )
        val [ i ] = max_val
    return val

