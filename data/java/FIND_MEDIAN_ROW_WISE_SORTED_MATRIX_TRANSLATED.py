====================
def f_gold ( m , r , c ) :
    max = int ( min ( m ) )
    min = int ( max )
    for i in range ( r ) :
        if m [ i ] [ 0 ] < min :
            min = m [ i ] [ 0 ]
        if m [ i ] [ c - 1 ] > max :
            max = m [ i ] [ c - 1 ]
    desired = ( r * c + 1 ) / 2
    while min < max :
        mid = min + ( max - min ) / 2
        place = 0
        get = 0
        for i in range ( r ) :
            get = bisect.bisect_left ( m , mid )
            if get < 0 :
                get = abs ( get ) - 1
            else :
                while get < len ( m [ i ] ) and m [ i ] [ get ] == mid :
                    get += 1
            place = place + get
        if place < desired :
            min = mid + 1
        else :
            max = mid
    return min

