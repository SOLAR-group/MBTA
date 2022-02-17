====================
def f_gold ( str ) :
    n = len ( str )
    maxlen = 0
    sum = [ 0 ] * n
    for i in range ( n ) :
        sum [ i ] = str [ i ] - '0'
    for len in range ( 2 , n + 1 ) :
        for i in range ( n - len + 1 ) :
            j = i + len - 1
            k = len // 2
            sum [ i ] = sum [ i ] + sum [ j - k + 1 ] [ j ]
            if len % 2 == 0 and sum [ i ] == sum [ ( j - k + 1 ) ] [ j ] and len > maxlen :
                maxlen = len
    return maxlen

