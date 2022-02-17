====================
def f_gold ( a , b ) :
    s = str ( b )
    i = 0
    for c in s :
        if c != '9' :
            break
    result = 0
    if i == len ( s ) :
        result = a * len ( s )
    else :
        result = a * ( len ( s ) - 1 )
    return result

