====================
def py2exe_output ( str1 , str2 , k ) :
    if ( len ( str1 ) + len ( str2 ) ) < k :
        return True
    common_length = 0
    for i in range ( min ( len ( str1 ) , len ( str2 ) ) ) :
        if str1 == str2 :
            common_length += 1
        else :
            break
    if ( k - len ( str1 ) - len ( str2 ) + 2 * common_length ) % 2 == 0 :
        return True
    return False

