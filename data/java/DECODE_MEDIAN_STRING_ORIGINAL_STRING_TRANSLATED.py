====================
def decode_median_string_original_string ( s ) :
    l = len ( s )
    s1 = ""
    is_even = ( l % 2 == 0 )
    for i in range ( 0 , l , 2 ) :
        if is_even :
            s1 = s [ i ] + s1
            s1 += s [ i + 1 ]
        else :
            if l - i > 1 :
                s1 += s [ i ]
                s1 = s [ i + 1 ] + s1
            else :
                s1 += s [ i ]
    return s1

