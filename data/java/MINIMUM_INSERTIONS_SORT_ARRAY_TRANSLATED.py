====================
def MINIMUM_INSERTIONS_SORT_ARRAY ( arr , N ) :
    lis = [ 1 ]
    for i in range ( N ) :
        lis [ i ] = 1
    for i in range ( 1 , N ) :
        for j in range ( 0 , i ) :
            if arr [ i ] >= arr [ j ] and lis [ i ] < lis [ j ] + 1 :
                lis [ i ] = lis [ j ] + 1
        max = 0
        for i in range ( N ) :
            if max < lis [ i ] :
                max = lis [ i ]
        return ( N - max )

