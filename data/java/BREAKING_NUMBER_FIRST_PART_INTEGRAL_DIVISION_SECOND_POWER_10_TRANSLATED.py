====================
def f_gold ( N ) :
    """
 Return the number of gold numbers in the given string.
 """
    N = N.split ( )
    l = ( len ( N ) ) // 2
    count = 0
    for i in range ( 1 , l + 1 ) :
        s = N [ : i ]
        l1 = len ( s )
        t = N [ i : l1 + i ]
        if s [ 0 ] == '0' or t [ 0 ] == '0' :
            continue
        if s == t :
            count += 1
    return count

