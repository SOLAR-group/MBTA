====================
def MINIMUM_XOR_VALUE_PAIR_1 ( arr , n ) :
    arr = np.array ( arr )
    min_xor = np.inf
    val = 0
    for i in range ( n - 1 ) :
        val = arr [ i ] ^ arr [ i + 1 ]
        min_xor = min ( min_xor , val )
    return min_xor

