====================
def f_gold ( X , Y ) :
    m , n = len ( X ) , len ( Y )
    L = [ [ 0 ] * ( n + 1 ) ] * ( n + 1 )
    bi = 0
    for i in range ( 0 , m ) :
        bi = i & 1
        for j in range ( 0 , n ) :
            if i == 0 or j == 0 :
                L [ bi ] [ j ] = 0
            elif X [ i - 1 ] == Y [ j - 1 ] :
                L [ bi ] [ j ] = L [ 1 - bi ] [ j - 1 ] + 1
            else :
                L [ bi ] [ j ] = max ( L [ 1 - bi ] [ j ] , L [ bi ] [ j - 1 ] )
    return L [ bi ] [ n ]

