====================
def count_sUM_of_digits_in_NUMBERS_FROM_1_TO_N ( n ) :
    if n < 10 :
        return ( n * ( n + 1 ) / 2 )
    d = int ( math.log10 ( n ) )
    a = [ 0 ] * ( d + 1 )
    for i in range ( 2 , d + 1 ) :
        a [ i ] = a [ i - 1 ] * 10 + 45 * int ( math.ceil ( math.pow ( 10 , i - 1 ) ) )
    p = int ( math.ceil ( math.pow ( 10 , d ) ) )
    msd = n / p
    return ( msd * a [ d ] + ( msd * ( msd - 1 ) / 2 ) * p + msd * ( 1 + n % p ) + f_gold ( n % p ) )

