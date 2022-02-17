====================
def f_gold ( s ) :
    l = len ( s )
    for i , j in enumerate ( s ) :
        if s [ i ] != s [ j ] :
            return False
    return True

