====================
def f_gold ( str ) :
    for c in str :
        if ord ( c ) < 128 :
            return c
    return 0

