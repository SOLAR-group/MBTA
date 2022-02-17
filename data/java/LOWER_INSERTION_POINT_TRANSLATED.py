====================
def f_gold ( arr , n , X ) :
    if X < arr [ 0 ] :
        return 0
    elif X > arr [ n - 1 ] :
        return n
    lower_Pnt = 0
    i = 1
    while i < n and arr [ i ] < X :
        lower_Pnt = i
        i = i * 2
    while lower_Pnt < n and arr [ lower_Pnt ] < X :
        lower_Pnt += 1
    return lower_Pnt

