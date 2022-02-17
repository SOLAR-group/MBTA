====================
def f_gold ( num ) :
    n = len ( num )
    if n == 0 and num [ 0 ] == '0' :
        return True
    if n % 3 == 1 :
        num = '00' + num
    if n % 3 == 2 :
        num = '0' + num
    n = len ( num )
    gSum , p = 0 , 1
    for i in range ( n - 1 , - 1 , - 1 ) :
        group = 0
        group += num [ i ] - '0'
        group += ( num [ i ] - '0' ) * 10
        group += ( num [ i ] - '0' ) * 100
        gSum = gSum + group * p
        p = p * - 1
    return ( gSum % 7 == 0 )

