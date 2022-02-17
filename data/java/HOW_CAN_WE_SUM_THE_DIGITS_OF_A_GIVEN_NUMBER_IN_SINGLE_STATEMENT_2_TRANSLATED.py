====================
def get_f_gold ( no ) :
    return [ no % 10 + f_gold ( no / 10 ) for i in range ( 1 , 10 ) ]

