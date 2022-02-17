====================
def f_gold ( str ) :
    i , j = 0 , len ( str ) - 1
    while i < j :
        if str [ i ] != str [ j ] :
            return False
        i += 1
        j -= 1
    return True

