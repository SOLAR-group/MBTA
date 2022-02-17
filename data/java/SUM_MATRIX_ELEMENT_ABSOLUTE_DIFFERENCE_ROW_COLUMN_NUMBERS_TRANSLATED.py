====================
def f_gold ( n ) :
    arr = np.zeros ( ( n , n ) )
    for i in range ( n ) :
        for j in range ( n ) :
            arr [ i , j ] = abs ( i - j )
    sum = 0
    for i in range ( n ) :
        for j in range ( n ) :
            sum += arr [ i , j ]
    return sum

