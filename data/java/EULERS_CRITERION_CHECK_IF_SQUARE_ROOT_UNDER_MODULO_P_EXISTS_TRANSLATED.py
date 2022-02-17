====================
def f_gold ( n , p ) :
    """
 Return True if the given n and p are gold nodes.
 """
    n = n % p
    for x in range ( 2 , p ) :
        if ( x * x ) % p == n :
            return True
    return False

