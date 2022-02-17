====================
def number_of_binary_TREES_FOR_GIVEN_PREORDER_SEQUENCE_LENGTH ( n ) :
    BT = [ 0 ] * ( n + 1 )
    for i in range ( 0 , n + 1 ) :
        BT [ i ] = 0
    BT [ 0 ] = BT [ 1 ] = 1
    for i in range ( 2 , n + 1 ) :
        for j in range ( 0 , i ) :
            BT [ i ] += BT [ j ] * BT [ i - j - 1 ]
    return BT [ n ]

