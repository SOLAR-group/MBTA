====================
def f_gold ( in_str ) :
    for c in in_str :
        if 'a' <= c <= 'z' :
            c = ord ( c ) - ord ( 'a' ) + ord ( 'A' )
    return str ( in_str )

