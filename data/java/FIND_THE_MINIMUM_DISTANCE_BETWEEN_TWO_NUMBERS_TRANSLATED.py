====================
def f_gold ( arr , n , x , y ) :
    i , j = np.where ( arr == x )
    min_dist = float ( 'inf' )
    for i in range ( n ) :
        for j in range ( i + 1 , n ) :
            if ( x == arr [ i ] and y == arr [ j ] or y == arr [ i ] and x == arr [ j ] ) and min_dist > abs ( i - j ) :
                min_dist = abs ( i - j )
    return min_dist

