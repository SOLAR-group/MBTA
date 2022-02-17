====================
def find_first_nat_number_whose_factorial_divisible_X ( x ) :
    i = 1
    fact = 1
    for i in range ( 1 , x ) :
        fact = fact * i
        if fact % x == 0 :
            break
    return i

