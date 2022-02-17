====================
def write_a_c_program_to_calculate_poWXN ( x , y ) :
    if y == 0 :
        return 1
    elif y % 2 == 0 :
        return f_gold ( x , y / 2 ) * f_gold ( x , y / 2 )
    else :
        return x * f_gold ( x , y / 2 ) * f_gold ( x , y / 2 )

