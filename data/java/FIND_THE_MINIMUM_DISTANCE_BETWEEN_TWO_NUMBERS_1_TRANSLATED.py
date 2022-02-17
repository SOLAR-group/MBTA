====================
def f_gold ( arr , n , x , y ) :
    i = 0
    min_dist = sys.maxint
    prev = 0
    for i in range ( n ) :
        if arr [ i ] == x or arr [ i ] == y :
            prev = i
            break
    for i in range ( n ) :
        if arr [ i ] == x or arr [ i ] == y :
            if arr [ prev ] != arr [ i ] and ( i - prev ) < min_dist :
                min_dist = i - prev
                prev = i
            else :
                prev = i
    return min_dist

