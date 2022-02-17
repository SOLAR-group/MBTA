====================
def py_check_string_follow_anBN_PATTERN_NOT ( s ) :
    l = len ( s )
    if l % 2 == 1 :
        return False
    i = 0
    j = l - 1
    while i < j :
        if s [ i ] != 'a' or s [ j ] != 'b' :
            return False
        i += 1
        j -= 1
    return True

