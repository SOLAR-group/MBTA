====================
def f_gold ( n ) :
    """
 Return the gold number of the given number.
 """
    sum = 0
    while n != 0 :
        sum = sum + n % 10
        n = n / 10
    return sum

