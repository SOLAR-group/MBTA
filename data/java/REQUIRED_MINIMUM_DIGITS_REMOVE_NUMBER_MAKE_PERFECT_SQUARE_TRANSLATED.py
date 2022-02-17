====================
def required_minimum_digit_remove_number_make_perfECT_square ( s ) :
    n = len ( s )
    ans = - 1
    num = ""
    for i in range ( 1 , ( 1 << n ) ) :
        str = ""
        for j in range ( n ) :
            if ( ( i >> j ) & 1 ) == 1 :
                str += s [ j ]
        if str [ 0 ] != '0' :
            temp = 0
            for j in range ( len ( str ) ) :
                temp = temp * 10 + int ( str [ j ] - '0' )
            k = int ( math.sqrt ( temp ) )
            if k * k == temp :
                if ans < int ( len ( str ) ) :
                    ans = int ( len ( str ) )
                    num = str
    if ans == - 1 :
        return ans
    else :
        print ( num , end = ' ' )
        return n - ans

