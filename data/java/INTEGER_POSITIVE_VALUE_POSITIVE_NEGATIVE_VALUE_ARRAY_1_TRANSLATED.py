====================
def f_gold ( arr , n ) :
    neg , pos = 0 , 0
    sum = 0
    for i in range ( n ) :
        sum += arr [ i ]
        if arr [ i ] < 0 :
            neg += 1
        else :
            pos += 1
    return ( sum / abs ( neg - pos ) )

