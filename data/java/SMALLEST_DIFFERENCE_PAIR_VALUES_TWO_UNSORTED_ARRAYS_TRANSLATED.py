====================
def f_gold ( A , B , m , n ) :
    A = np.array ( A )
    B = np.array ( B )
    a , b = 0 , 0
    result = np.inf
    while a < m and b < n :
        if abs ( A [ a ] - B [ b ] ) < result :
            result = abs ( A [ a ] - B [ b ] )
        if A [ a ] < B [ b ] :
            a += 1
        else :
            b += 1
    return result

