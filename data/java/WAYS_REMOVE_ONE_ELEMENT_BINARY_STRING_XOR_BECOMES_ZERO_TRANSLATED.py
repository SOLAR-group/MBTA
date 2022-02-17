====================
def f_gold ( s ) :
    one_count , zero_count = 0 , 0
    str = s.split ( )
    n = len ( str )
    for i in range ( n ) :
        if str [ i ] == '1' :
            one_count += 1
        else :
            zero_count += 1
    if one_count % 2 == 0 :
        return zero_count
    return one_count

