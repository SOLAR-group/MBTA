====================
def f_gold ( str ) :
    n = len ( str )
    C = [ ]
    P = [ ]
    i , j , k , L = 0 , 0 , 0 , 0
    for i in range ( n ) :
        P.append ( True )
    for L in range ( 2 , n + 1 ) :
        for i in range ( n - L + 1 ) :
            j = i + L - 1
            if L == 2 :
                P [ i ] [ j ] = ( str [ i ] == str [ j ] )
            else :
                P [ i ] [ j ] = ( str [ i ] == str [ j ] ) and P [ i + 1 ] [ j - 1 ]
    for i in range ( n ) :
        if P [ 0 ] [ i ] == True :
            C.append ( 0 )
        else :
            C.append ( int ( str [ i ] ) )
            for j in range ( i ) :
                if P [ j + 1 ] [ i ] == True and 1 + C [ j ] < C [ i ] :
                    C [ i ] = 1 + C [ j ]
    return C [ - 1 ]

