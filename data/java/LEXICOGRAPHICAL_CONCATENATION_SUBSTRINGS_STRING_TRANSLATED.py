====================
def f_gold ( s ) :
    n = len ( s )
    sub_count = n * ( n + 1 ) // 2
    arr = [ ]
    index = 0
    for i in range ( n ) :
        for len in range ( 1 , n - i + 1 ) :
            arr.append ( s [ i : i + len ] )
    arr.sort ( )
    res = ""
    for i in range ( sub_count ) :
        res += arr [ i ]
    return res

