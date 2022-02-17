====================
def f_gold ( n , x , y ) :
    arr = [ ]
    if x <= n :
        arr.append ( True )
    if y <= n :
        arr.append ( True )
    result = 0
    for i in range ( min ( x , y ) , n + 1 ) :
        if arr [ i ] :
            if i + x <= n :
                arr.append ( True )
            if i + y <= n :
                arr.append ( True )
            result += 1
    return result

