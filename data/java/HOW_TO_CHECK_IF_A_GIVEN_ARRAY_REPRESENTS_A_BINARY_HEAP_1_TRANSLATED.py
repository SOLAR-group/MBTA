====================
def f_gold ( arr , n ) :
    for i in range ( 0 , ( n - 2 ) // 2 ) :
        if arr [ 2 * i + 1 ] > arr [ i ] :
            return False
        if 2 * i + 2 < n and arr [ 2 * i + 2 ] > arr [ i ] :
            return False
    return True

