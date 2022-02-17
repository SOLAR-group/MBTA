====================
def f_gold ( arr , n ) :
    max_a , max_b = - 100000000 , - 100000000
    max_c = - 100000000
    for i in range ( n ) :
        if arr [ i ] > max_a :
            max_c = max_b
            max_b = max_a
            max_a = arr [ i ]
        elif arr [ i ] > max_b :
            max_c = max_b
            max_b = arr [ i ]
        elif arr [ i ] > max_c :
            max_c = arr [ i ]
    return ( max_a , max_b , max_c )

