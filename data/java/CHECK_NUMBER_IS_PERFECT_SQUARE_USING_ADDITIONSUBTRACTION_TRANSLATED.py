====================
def check_number_is_perfECT_SQUARE_USING_ADDITIONSUBTRACTION ( n ) :
    for sum , i in zip ( range ( 1 , n + 1 ) , range ( 1 , n + 1 ) ) :
        sum += i
        if sum == n :
            return True
    return False

