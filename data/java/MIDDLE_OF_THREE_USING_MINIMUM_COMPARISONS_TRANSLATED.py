====================
def f_gold ( a , b , c ) :
    if ( a < b and b < c ) or ( c < b and b < a ) :
        return b
    elif ( b < a and a < c ) or ( c < a and a < b ) :
        return a
    else :
        return c

