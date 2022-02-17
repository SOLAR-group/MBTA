====================
def find_unit_digit_X_RAISED_POWER_Y ( x , y ) :
    res = 1
    for i in range ( y ) :
        res = ( res * x ) % 10
    return res

