====================
def f_gold ( str ) :
    mark = [ False ] * 26
    index = 0
    for c in str :
        if 'A' <= c <= 'Z' :
            index = c - 'A'
        elif 'a' <= c <= 'z' :
            index = c - 'a'
        mark [ index ] = True
    for i in range ( 0 , 25 ) :
        if mark [ i ] == False :
            return ( False , '' )
        return ( True , '' )

