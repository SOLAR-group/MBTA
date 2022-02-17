====================
def f_gold ( str1 , str2 ) :
    n1 = len ( str1 )
    n2 = len ( str2 )
    if n1 != n2 :
        return False
    str1 = str1 [ : n1 ] + str2 [ : n2 ]
    for i in range ( n1 ) :
        if str1 [ i ] != str2 [ i ] :
            return False
    return True

