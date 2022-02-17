====================
def f_gold ( arr , n ) :
    d1 , d2 = 0 , 0
    for i in range ( n ) :
        d1 += arr [ i ] [ i ]
        d2 += arr [ i ] [ n - i - 1 ]
    return abs ( d1 - d2 )

