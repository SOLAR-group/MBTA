====================
def f_gold ( arr , n ) :
    invcount = 0
    for i in range ( n - 2 ) :
        for j in range ( i + 1 , n - 1 ) :
            if arr [ i ] > arr [ j ] :
                for k in range ( j + 1 , n ) :
                    if arr [ j ] > arr [ k ] :
                        invcount += 1
    return invcount

