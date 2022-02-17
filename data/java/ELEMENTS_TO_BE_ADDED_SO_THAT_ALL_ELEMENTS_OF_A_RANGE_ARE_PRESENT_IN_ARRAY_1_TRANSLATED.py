====================
def f_gold ( arr , n ) :
    s = set ( )
    count , maxm , minm = 0 , int ( n ) , int ( n )
    for i in range ( n ) :
        s.add ( arr [ i ] )
        if arr [ i ] < minm :
            minm , maxm = arr [ i ] , arr [ i ]
    for i in range ( minm , maxm + 1 ) :
        if not s.intersection ( arr [ i ] ) :
            count += 1
    return count

