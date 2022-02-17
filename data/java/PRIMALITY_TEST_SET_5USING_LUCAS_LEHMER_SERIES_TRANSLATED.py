====================
def f_gold ( p ) :
    """
 Return True if the number of gold points is the same as the number of gold points.
 """
    check_number = pow ( 2 , p ) - 1
    nextval = 4 % check_number
    for i in range ( 1 , p - 1 ) :
        nextval = ( nextval * nextval - 2 ) % check_number
    return ( nextval == 0 )

