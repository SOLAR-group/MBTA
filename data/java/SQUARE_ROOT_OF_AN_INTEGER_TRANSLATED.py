====================
def py2c_file ( x ) :
    if x == 0 or x == 1 :
        return x
    i , result = 1 , 1
    while result <= x :
        i += 1
        result = i * i
    return i - 1

