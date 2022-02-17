====================
def f_gold ( arr , n ) :
    max = int ( arr [ 0 ] )
    min = int ( arr [ 1 ] )
    for i in range ( n ) :
        max = max ( max , arr [ i ] )
        min = min ( min , arr [ i ] )
    m = max - min + 1
    if m > n :
        return False
    visited = [ ]
    for i in range ( n ) :
        visited.append ( True )
    for i in range ( m ) :
        if visited [ i ] == False :
            return False
    return True

