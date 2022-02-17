====================
def f_gold ( s ) :
    p , i , k = s.split ( ' ' )
    MAX_CHAR = 256
    hash = [ ]
    pos = [ ]
    for i in range ( 0 , len ( s ) ) :
        k = ord ( s [ i ] )
        if hash [ k ] == 0 :
            hash [ k ] += 1
            pos.append ( i )
        elif hash [ k ] == 1 :
            hash [ k ] += 1
    for i in range ( MAX_CHAR ) :
        if hash [ i ] == 2 :
            if p == - 1 :
                p = pos [ i ]
            elif p > pos [ i ] :
                p = pos [ i ]
    return p

