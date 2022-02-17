====================
def f_gold ( s , K ) :
    n = len ( s )
    C , c1 , c2 = 0 , 0 , 0
    for i in range ( n ) :
        if s [ i ] == 'a' :
            c1 += 1
        if s [ i ] == 'b' :
            c2 += 1
            C += c1
    return C * K + ( K * ( K - 1 ) / 2 ) * c1 * c2

