====================
def py2exe_flags ( n ) :
    if n == 0 or n == 9 :
        return True
    if n < 9 :
        return False
    return f_gold ( int ( n >> 3 ) - int ( n & 7 ) )

