====================
def py2c_gold ( arr , n , k ) :
    for i in range ( k ) :
        x = arr [ 0 ]
        for j in range ( n - 1 ) :
            arr [ j ] = arr [ j + 1 ]
        arr [ n - 1 ] = x
    return arr

