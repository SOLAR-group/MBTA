====================
def f_gold ( arr , n ) :
    arr = np.asarray ( arr )
    dimension = [ 0 , 0 ]
    for i , j in enumerate ( range ( n - 1 , 2 ) ) :
        if arr [ i ] == arr [ i + 1 ] :
            dimension [ j ] = arr [ i ]
    return ( dimension [ 0 ] * dimension [ 1 ] , dimension [ 1 ] * dimension [ 2 ] )

