====================
def find_value_of_y_mod_2_raise_to_power_x ( y , x ) :
    if ( math.log ( y ) / math.log ( 2 ) ) < x :
        return y
    if x > 63 :
        return y
    return ( y % ( 1 << int ( x ) ) )

