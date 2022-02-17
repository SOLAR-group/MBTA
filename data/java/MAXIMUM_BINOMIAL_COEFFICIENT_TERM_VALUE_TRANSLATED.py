====================
def f_gold ( n ) :
    C = [ ]
    for i in range ( 0 , n + 1 ) :
        for j in range ( 0 , min ( i , n ) ) :
            if j == 0 or j == i :
                C.append ( 1 )
            else :
                C.append ( C [ i - 1 ] [ j - 1 ] + C [ i - 1 ] [ j ] )
    maxvalue = 0
    for i in range ( 0 , n + 1 ) :
        maxvalue = max ( maxvalue , C [ n ] [ i ] )
    return maxvalue

