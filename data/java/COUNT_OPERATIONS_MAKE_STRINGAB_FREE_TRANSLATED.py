====================
def count_OPERATIONS_MAKE_STRINGAB_FREE ( s ) :
    b_count = 0
    res = 0
    for i in range ( len ( s ) ) :
        if s [ - i - 1 ] == 'a' :
            res = ( res + b_count )
            b_count = ( b_count * 2 )
        else :
            b_count += 1
    return res

