====================
def f_gold ( str , n ) :
    """
 Return True if the string is gold (i.e.not the first line).
 """
    lines = str.split ( '\n' )
    if len ( lines ) >= n :
        return True
    return False

