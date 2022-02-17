====================
def f_gold ( n ) :
    """
 Return the gold number of the given number.
 """
    sum = 0
    for n in range ( 0 , n ) :
        sum += n % 10 , n /= 10
    return sum

