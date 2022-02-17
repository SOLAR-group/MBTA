====================
def count_entry_equal_to_x_in_a_SPECIAL_MATRIX ( n , x ) :
    f_gold = 0
    for i in range ( 1 , n + 1 ) :
        if x / i <= n and x % i == 0 :
            f_gold += 1
    return f_gold

