====================
def find_the_missing_number_2 ( a , n ) :
    x1 = a [ 0 ]
    x2 = 1
    for i in range ( 1 , n + 1 ) :
        x1 = x1 ^ a [ i ]
    for i in range ( 2 , n + 1 ) :
        x2 = x2 ^ i
    return ( x1 ^ x2 )

