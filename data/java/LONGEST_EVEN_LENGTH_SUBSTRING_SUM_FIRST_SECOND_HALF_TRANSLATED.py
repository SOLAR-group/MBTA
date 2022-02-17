====================
def f_gold ( str ) :
    n = len ( str )
    maxlen = 0
    for i in range ( n ) :
        for j in range ( i + 1 , n , 2 ) :
            length = j - i + 1
            leftsum , rightsum = 0 , 0
            for k in range ( length / 2 ) :
                leftsum += ( str [ i + k ] - '0' )
                rightsum += ( str [ i + k + length / 2 ] - '0' )
            if leftsum == rightsum and maxlen < length :
                maxlen = length
    return maxlen

