====================
def f_gold ( s , c1 , c2 ) :
    l = len ( s )
    arr = s [ : l ]
    for i in range ( l ) :
        if arr [ i ] == c1 :
            arr [ i ] = c2
        elif arr [ i ] == c2 :
            arr [ i ] = c1
    return str ( arr )

