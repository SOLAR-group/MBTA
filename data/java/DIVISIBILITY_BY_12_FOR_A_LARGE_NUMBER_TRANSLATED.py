====================
def f_gold ( num ) :
    if len ( num ) >= 3 :
        d1 = int ( num [ - 1 ] )
        if d1 % 2 != 0 :
            return False
        d2 = int ( num [ - 2 ] )
        sum = 0
        for i in range ( len ( num ) ) :
            sum += num [ i ]
        return ( sum % 3 == 0 and ( d2 * 10 + d1 ) % 4 == 0 )
    else :
        number = int ( num )
        return ( number % 12 == 0 )

