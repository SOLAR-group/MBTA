====================
def f_gold ( num , divisor ) :
    """
 Return the gold value of the given number.
 """
    while num >= divisor :
        num -= divisor
    return num

