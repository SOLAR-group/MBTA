====================
def check_diVISIBILITY_LARGE_NUMBER_999 ( num ) :
    n = len ( num )
    if n == 0 and num [ 0 ] == '0' :
        return True
    if n % 3 == 1 :
        num = '00' + num
    if n % 3 == 2 :
        num = '0' + num
    gSum = 0
    for i in range ( n ) :
        group = 0
        group += ( num [ i ] - '0' ) * 100
        group += ( num [ i + 1 ] - '0' ) * 10
        group += num [ i ] - '0'
        gSum += group
    if gSum > 1000 :
        num = str ( gSum )
        n = len ( num )
        gSum = f_gold ( num ) or 1
    return ( gSum == 999 )

