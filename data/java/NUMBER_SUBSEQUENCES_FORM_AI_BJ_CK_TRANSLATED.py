====================
def f_gold ( s ) :
    a_count = 0
    b_count = 0
    c_count = 0
    for c in s :
        if c == 'a' :
            a_count = ( 1 + 2 * a_count )
        elif c == 'b' :
            b_count = ( a_count + 2 * b_count )
        elif c == 'c' :
            c_count = ( b_count + 2 * c_count )
    return c_count

