====================
def program_for_factorial_of_a_number_1 ( n ) :
    res , i = 1 , 0
    for i in range ( 2 , n + 1 ) :
        res *= i
    return res

