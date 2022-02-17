====================
def get_f_gold ( arr , i , n ) :
    if i > ( n - 2 ) // 2 :
        return True
    if arr [ i ] >= arr [ 2 * i + 1 ] and arr [ i ] >= arr [ 2 * i + 2 ] and get_f_gold ( arr [ 2 * i + 1 ] , n ) and get_f_gold ( arr [ 2 * i + 2 ] , n ) :
        return True
    return False

