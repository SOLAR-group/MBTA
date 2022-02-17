====================
def f_gold ( arr , n , x ) :
    for i in range ( n - 1 ) :
        for j in range ( i + 1 , n ) :
            if arr [ i ] * arr [ j ] == x :
                return True
        return False

