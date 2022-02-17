====================
def f_gold ( arr , n , x ) :
    i = 0
    for i in range ( n - 1 ) :
        if arr [ i ] > arr [ i + 1 ] :
            break
    l = ( i + 1 ) % n
    r = i
    while l != r :
        if arr [ l ] + arr [ r ] == x :
            return True
        if arr [ l ] + arr [ r ] < x :
            l = ( l + 1 ) % n
        else :
            r = ( n + r - 1 ) % n
    return False

