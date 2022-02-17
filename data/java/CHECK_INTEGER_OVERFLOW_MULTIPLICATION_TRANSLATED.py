====================
def py2c_long ( a , b ) :
    if a == 0 or b == 0 :
        return False
    result = a * b
    if a == result / b :
        return False
    else :
        return True

