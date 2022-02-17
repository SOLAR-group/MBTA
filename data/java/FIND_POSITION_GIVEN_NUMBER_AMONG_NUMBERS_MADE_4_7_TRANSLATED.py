====================
def find_position_given_number_amONG_NUMBERS_MADE_4_7 ( n ) :
    k , pos , i = 0 , 0 , 0
    while k != len ( n ) :
        try :
            pos = pos * 2 + 1
        except :
            pass
        i += 1
        k += 1
    return pos

