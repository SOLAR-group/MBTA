====================
def f_gold ( mat , m , n ) :
    row_sum = [ ]
    for i in range ( m ) :
        sum = 0
        for j in range ( n ) :
            sum += mat [ i , j ]
        row_sum.append ( sum )
    max_diff = row_sum [ 1 ] - row_sum [ 0 ]
    min_element = row_sum [ 0 ]
    for i in range ( 1 , m ) :
        if row_sum [ i ] - min_element > max_diff :
            max_diff = row_sum [ i ] - min_element
        if row_sum [ i ] < min_element :
            min_element = row_sum [ i ]
    return max_diff , min_element

