====================
def p_program_check_ARRAY_Sorted_not_iterative_recursive ( p ) :
    '''program_check_ARRAY_not_iterative_recursive : program_check_ARRAY_not_iterative_recursive program_check_ARRAY_not_iterative_recursive program_check_ARRAY_not_iterative_recursive program_check_ARRAY_not_iterative_recursive'''
    if len ( p ) == 1 or len ( p ) == 0 :
        return 1
    if p [ - 1 ] < p [ - 2 ] :
        return 0
    return p [ - 1 ]

