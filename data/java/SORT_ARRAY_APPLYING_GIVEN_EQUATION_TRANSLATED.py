====================
def f_gold ( arr , n , A , B , C ) :
    for i in range ( n ) :
        arr [ i ] = A * arr [ i ] * arr [ i ] + B * arr [ i ] + C
    index = - 1
    maximum = - 999999
    for i in range ( n ) :
        if maximum < arr [ i ] :
            index = i
            maximum = arr [ i ]
    i , j = 0 , n - 1
    new_arr = [ ]
    k = 0
    while i < index and j > index :
        if arr [ i ] < arr [ j ] :
            new_arr.append ( arr [ i ++ ] )
        else :
            new_arr.append ( arr [ j -- ] )
    while i < index :
        new_arr.append ( arr [ i ++ ] )
    while j > index :
        new_arr.append ( arr [ j -- ] )
    new_arr.append ( maximum )
    for p in range ( n ) :
        arr [ p ] = new_arr [ p ]
    return arr

