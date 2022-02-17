====================
def find_minimum_difference_paIR_1 ( arr , n ) :
    arr = np.array ( arr )
    diff = np.inf
    for i in range ( n - 1 ) :
        if arr [ i + 1 ] - arr [ i ] < diff :
            diff = arr [ i + 1 ] - arr [ i ]
    return diff

