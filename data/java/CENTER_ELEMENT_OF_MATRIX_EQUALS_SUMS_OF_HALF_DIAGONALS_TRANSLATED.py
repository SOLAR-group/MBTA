====================
def f_gold ( mat , n ) :
    diag1_left , diag1_right = 0 , 0
    diag2_left , diag2_right = 0 , 0
    for i , j in enumerate ( n - 1 ) :
        if i < n // 2 :
            diag1_left += mat [ i ] [ i ]
            diag2_left += mat [ j ] [ i ]
        elif i > n // 2 :
            diag1_right += mat [ i ] [ i ]
            diag2_right += mat [ j ] [ i ]
    return ( diag1_left , diag2_right , diag1_right , diag2_left , diag2_right )

