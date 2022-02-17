====================
def f_gold ( a1 , a2 , a3 , n1 , n2 , n3 , sum ) :
    for i in range ( n1 ) :
        for j in range ( n2 ) :
            for k in range ( n3 ) :
                if a1 [ i ] + a2 [ j ] + a3 [ k ] == sum :
                    return True
            return False

