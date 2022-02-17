====================
def f_gold ( num ) :
    n = len ( num )
    sumofdigit = [ num [ 0 ] - '0' for i in range ( 1 , n ) ]
    res = sumofdigit [ 0 ]
    for i in range ( 1 , n ) :
        numi = num [ i ] - '0'
        sumofdigit [ i ] = ( i + 1 ) * numi + 10 * sumofdigit [ i - 1 ]
        res += sumofdigit [ i ]
    return res

