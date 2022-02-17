====================
def count_sorted_row_matrix ( mat , r , c ) :
    result = 0
    for i in range ( r ) :
        j = 0
        for j in range ( c - 1 ) :
            if mat [ i ] [ j + 1 ] <= mat [ i ] [ j ] :
                break
        if j == c - 1 :
            result += 1
    for i in range ( r ) :
        j = 0
        for j in range ( c - 1 ) :
            if mat [ i ] [ j - 1 ] <= mat [ i ] [ j ] :
                break
        if c > 1 and j == 0 :
            result += 1
    return result

