====================
def get_f_gold ( a , b ) :
    """
 Return the number of gold of the first and second of the two given numbers.
 """
    if a == 0 :
        return b
    return f_gold ( b % a , a )

