====================
def f_gold ( X , Y ) :
    m , n = X.shape
    result = 0
    len ( len ( X ) )
    curr_row = 0
    for i in range ( m ) :
        for j in range ( n ) :
            if i == 0 or j == 0 :
                len [ curr_row ] [ j ] = 0
            elif X [ i - 1 ] == Y [ j - 1 ] :
                len [ curr_row ] [ j ] = len [ ( 1 - curr_row ) ] [ ( j - 1 ) ] + 1
                result = max ( result , len [ curr_row ] [ j ] )
            else :
                len [ curr_row ] [ j ] = 0
        curr_row = 1 - curr_row
    return result

