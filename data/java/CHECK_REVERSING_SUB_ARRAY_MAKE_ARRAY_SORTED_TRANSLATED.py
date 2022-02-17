====================
def f_gold ( arr , n ) :
    temp = [ ]
    for i in range ( n ) :
        temp.append ( arr [ i ] )
    temp.sort ( )
    front = 0
    for front in range ( n ) :
        if temp [ front ] != arr [ front ] :
            break
    back = 0
    for back in range ( n - 1 , - 1 , - 1 ) :
        if temp [ back ] != arr [ back ] :
            break
    if front >= back :
        return True
    do = 1
    if arr [ front - 1 ] < arr [ front ] :
        return False

