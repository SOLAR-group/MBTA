====================
def MAXIMUM_TRIPLET_SUM_ARRAY ( arr , n ) :
    sum = - 1000000
    for i in range ( n ) :
        for j in range ( i + 1 , n ) :
            for k in range ( j + 1 , n ) :
                if sum < arr [ i ] + arr [ j ] + arr [ k ] :
                    sum = arr [ i ] + arr [ j ] + arr [ k ]
        return sum

