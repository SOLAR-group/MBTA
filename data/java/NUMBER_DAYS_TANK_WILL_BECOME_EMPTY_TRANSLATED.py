====================
def number_days_tank_will_becoming_empty ( C , l ) :
    if l >= C :
        return C
    eq_root = ( math.sqrt ( 1 + 8 * ( C - l ) ) - 1 ) / 2
    return int ( math.ceil ( eq_root ) + l )

