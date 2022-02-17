====================
def f_gold ( n ) :
    arr = [ ]
    for i in range ( 10 ) :
        arr.append ( False )
    while n > 0 :
        digit = n % 10
        if arr [ digit ] :
            return False
        arr.append ( True )
        n = n / 10
    return True

