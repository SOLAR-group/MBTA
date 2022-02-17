====================
def f_gold ( arr , n , key , capacity ) :
    if n >= capacity :
        return n
    i = 0
    for ( i , val ) in enumerate ( arr ) :
        arr [ i + 1 ] = val
    arr [ i + 1 ] = key
    return ( n + 1 , arr )

