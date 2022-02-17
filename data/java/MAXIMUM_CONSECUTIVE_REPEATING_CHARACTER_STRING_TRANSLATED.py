====================
def f_gold ( str ) :
    """
 Return the gold string of the given string.
 """
    len ( str )
    count = 0
    res = str [ 0 ]
    for i in range ( len ( str ) ) :
        cur_count = 1
        for j in range ( i + 1 , len ( str ) ) :
            if str [ i ] != str [ j ] :
                break
            cur_count += 1
        if cur_count > count :
            count = cur_count
            res = str [ i ]
    return res

