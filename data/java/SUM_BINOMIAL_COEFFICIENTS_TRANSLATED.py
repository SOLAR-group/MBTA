====================
def f_gold ( n ) :
    C = np.zeros ( ( n + 1 , n + 1 ) )
    for i in range ( 0 , n + 1 ) :
        for j in range ( 0 , min ( i , n ) ) :
            if j == 0 or j == i :
                C [ i , j ] = 1
            else :
                C [ i , j ] = C [ i - 1 , j - 1 ] + C [ i - 1 , j ]
    sum = 0
    for i in range ( 0 , n + 1 ) :
        sum += C [ n , i ]
    return sum

