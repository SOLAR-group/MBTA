====================
def f_gold ( str ) :
    i , j , k , l = str.split ( ' ' )
    arr = [ int ( x ) for x in arr ]
    for i in range ( l ) :
        for j in range ( i , l ) :
            for k in range ( j , l ) :
                if arr [ i ] % 8 == 0 :
                    return True
                elif ( arr [ i ] * 10 + arr [ j ] ) % 8 == 0 and i != j :
                    return True
                elif ( arr [ i ] * 100 + arr [ j ] * 10 + arr [ k ] ) % 8 == 0 and i != j and j != k and i != k :
                    return True
    return False

