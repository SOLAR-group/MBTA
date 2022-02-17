====================
def get_f_gold ( n ) :
    if n == 0 or n == 1 :
        return 1
    return n * get_f_gold ( n - 2 )

