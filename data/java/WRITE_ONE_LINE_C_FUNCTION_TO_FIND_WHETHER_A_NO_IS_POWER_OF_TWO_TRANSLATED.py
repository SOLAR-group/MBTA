====================
def write_one_line_c_function_to_find_wheel_a_no_is_power_of_two ( n ) :
    if n == 0 :
        return False
    while n != 1 :
        if n % 2 != 0 :
            return False
        n = n / 2
    return True

