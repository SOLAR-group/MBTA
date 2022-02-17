====================
def get_sqres_root ( n ) :
    x = n
    y = 1
    while x > y :
        x = ( x + y ) // 2
        y = n // x
    return ( x , y )

