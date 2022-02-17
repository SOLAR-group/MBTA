====================
def f_gold ( symb , oper , n ) :
    F = [ ]
    T = [ ]
    for i in range ( n ) :
        F.append ( ( symb [ i ] , symb [ i + 1 ] ) )
        T.append ( ( symb [ i ] , symb [ i + 1 ] ) )
    for gap in range ( 1 , n ) :
        for i , j in zip ( gap , n ) :
            T [ i ] = F [ i ] [ j ] = 0
            for g in range ( gap ) :
                k = i + g
                tik = T [ i ] [ k ] + F [ i ] [ k ]
                tkj = T [ k + 1 ] [ j ] + F [ k + 1 ] [ j ]
                if oper [ k ] == '&' :
                    T [ i ] [ j ] += T [ i ] [ k ] * T [ k + 1 ] [ j ]
                    F [ i ] [ j ] += ( tik * tkj - T [ i ] [ k ] * T [ k + 1 ] [ j ] )
                if oper [ k ] == '|' :
                    F [ i ] [ j ] += F [ i ] [ k ] * F [ k + 1 ] [ j ]
                    T [ i ] [ j ] += ( tik * tkj - F [ i ] [ k ] * F [ k + 1 ] [ j ] )
                if oper [ k ] == '^' :
                    T [ i ] [ j ] += F [ i ] [ k ] * T [ k + 1 ] [ j ] + T [ i ] [ k ] * F [ k + 1 ] [ j ]
                    F [ i ] [ j ] += T [ i ] [ k ] * T [ k + 1 ] [ j ]
                if oper [ k ] == '&' :
                    T [ i ] [ j ] += F [ i ] [ k ] * T [ k + 1 ] [ j ] + T [ i ] [ k ] * F [ k + 1 ] [ j ]
                    F [ i ] [ j ] += T [ i ] [ k ] * T [ k + 1 ] [ j ]
    return F

