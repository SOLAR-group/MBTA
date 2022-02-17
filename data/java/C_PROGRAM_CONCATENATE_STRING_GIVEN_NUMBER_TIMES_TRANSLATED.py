====================
def c_program_concat_string_given_number_times ( s , n ) :
    s1 = s
    for i in range ( 1 , n ) :
        s += s1
    return s

