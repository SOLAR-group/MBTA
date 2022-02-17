====================
def f_gold ( arr1 , arr2 , m , n , k ) :
    sorted1 = [ ]
    i , j , d = 0 , 0 , 0
    while i < m and j < n :
        if arr1 [ i ] < arr2 [ j ] :
            sorted1.append ( arr1 [ i ++ ] )
        else :
            sorted1.append ( arr2 [ j ++ ] )
    while i < m :
        sorted1.append ( arr1 [ i ++ ] )
    while j < n :
        sorted1.append ( arr2 [ j ++ ] )
    return sorted1 [ k - 1 ]

