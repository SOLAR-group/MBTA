====================
def f_gold ( n ) :
    if n == 1 :
        return 1
    z = None
    e = 2.71
    z = math.sqrt ( 2 * 3.14 * n ) * math.pow ( ( n / e ) , n )
    return int ( z )

