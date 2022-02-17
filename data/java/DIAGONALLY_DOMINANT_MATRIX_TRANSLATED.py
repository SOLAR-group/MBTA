====================
def f_gold ( m , n ) :
    for i in range ( n ) :
        sum = 0
        for j in range ( n ) :
            sum += abs ( m [ i , j ] )
        sum -= abs ( m [ i , i ] )
        if abs ( m [ i , i ] ) < sum :
            return False
    return True

