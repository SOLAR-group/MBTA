====================
def f_gold ( n ) :
    """
 Return the sum of all the gold products of n in the given order.
 """
    sum = 0
    for i in range ( 1 , n + 1 ) :
        for j in range ( i , n + 1 ) :
            sum = sum + i * j
    return sum

