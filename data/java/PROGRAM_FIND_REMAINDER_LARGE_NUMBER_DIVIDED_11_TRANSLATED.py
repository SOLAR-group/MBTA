====================
def program_find_remaINDER_LARGE_NUMBER_DIVIDED_11 ( str ) :
    """
 Find the largest number of elements in a string.
 """
    str = str.lower ( )
    num , rem = 0 , 0
    for i in range ( len ( str ) ) :
        num = rem * 10 + ( str [ i ] - '0' )
        rem = num % 11
    return rem

