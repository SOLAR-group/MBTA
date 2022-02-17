====================
def f_gold ( x , y , n ) :
    dp = np.zeros ( ( n + 1 , ) , dtype = bool )
    dp [ 0 , 0 ] = False
    dp [ 1 , 0 ] = True
    for i in range ( 2 , n + 1 ) :
        if i - 1 >= 0 and dp [ i - 1 , 0 ] == False :
            dp [ i , 0 ] = True
        elif i - x >= 0 and dp [ i - x , 0 ] == False :
            dp [ i , 0 ] = True
        elif i - y >= 0 and dp [ i - y , 0 ] == False :
            dp [ i , 0 ] = True
        else :
            dp [ i , 0 ] = False
    return dp

