====================
def find_the_element_that_appears_once_2 ( a , n ) :
    s = set ( )
    for i in a :
        s.add ( i )
    arr_sum = 0
    for i in a :
        arr_sum += i
    set_sum = 0
    for i in s :
        set_sum += i
    return ( 3 * set_sum - arr_sum ) / 2

