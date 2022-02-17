====================
def f_gold ( arr , n , k ) :
    arr = np.asarray ( arr )
    max = arr [ - 1 ]
    res = 0
    for i in range ( n ) :
        if ( max - arr [ i ] ) % k != 0 :
            return - 1
        else :
            res += ( max - arr [ i ] ) / k
    return res

