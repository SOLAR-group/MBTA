====================
def f_gold ( arr , n , k ) :
    sum = [ 0 ] * ( n + 1 )
    for i in range ( 2 , n + 1 ) :
        sum [ i ] = sum [ i - 1 ] + arr [ i - 1 ]
    Q = PriorityQueue ( )
    for i in range ( 1 , n + 1 ) :
        for j in range ( i , n + 1 ) :
            x = sum [ j ] - sum [ i - 1 ]
            if len ( Q ) < k :
                Q.add ( x )
            else :
                if Q.peek ( ) < x :
                    Q.poll ( )
                    Q.add ( x )
    return Q.get ( )

