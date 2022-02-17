====================
def f_gold ( A , arr_size , sum ) :
    l , r = np.shape ( A )
    for i in range ( arr_size - 2 ) :
        for j in range ( i + 1 , arr_size - 1 ) :
            for k in range ( j + 1 , arr_size ) :
                if A [ i , j , k ] + A [ j , k ] == sum :
                    print ( "Triplet is %d, %d, %d" % ( A [ i , j , k ] , A [ i , j , k ] ) )
                    return True
    return False

