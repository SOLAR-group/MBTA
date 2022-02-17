====================
def f_gold ( arr , n , x ) :
    hset = set ( )
    if n < 2 :
        return False
    for i in range ( n ) :
        if arr [ i ] == 0 :
            if x == 0 :
                return True
            else :
                continue
        if x % arr [ i ] == 0 :
            if hset.intersection ( x / arr [ i ] ) :
                return True
            hset.add ( arr [ i ] )
    return False

