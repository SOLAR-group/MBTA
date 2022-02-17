====================
def f_gold ( arr , n ) :
    for i in range ( n - 1 ) :
        if arr [ i ] > arr [ i + 1 ] :
            if arr [ i ] - arr [ i + 1 ] == 1 :
                temp = arr [ i ]
                arr [ i ] = arr [ i + 1 ]
                arr [ i + 1 ] = temp
            else :
                return False
    return True

