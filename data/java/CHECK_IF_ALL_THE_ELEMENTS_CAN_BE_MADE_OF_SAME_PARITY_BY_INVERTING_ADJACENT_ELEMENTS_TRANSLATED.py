====================
def f_gold ( a , n ) :
    """
 Check if all the elements can be made of the same parities by inverting adjacent elements.
 """
    count_odd , count_even = 0 , 0
    for i in range ( n ) :
        if ( a [ i ] & 1 ) == 1 :
            count_odd += 1
        else :
            count_even += 1
    if count_odd % 2 == 1 and count_even % 2 == 1 :
        return False
    else :
        return True

