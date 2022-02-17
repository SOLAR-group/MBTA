====================
def f_gold ( arr , low , high , x ) :
    i = 0
    if x <= arr [ low ] :
        return low
    for i in range ( low , high ) :
        if arr [ i ] == x :
            return i
        if arr [ i ] < x and arr [ i + 1 ] >= x :
            return i + 1
    return - 1

