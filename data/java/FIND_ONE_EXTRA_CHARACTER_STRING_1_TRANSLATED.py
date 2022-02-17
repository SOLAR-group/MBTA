====================
def find_one_extra_character_string_1 ( str_a , str_b ) :
    res , i = 0 , 0
    for i in range ( len ( str_a ) ) :
        res ^= str_a [ i ]
    for i in range ( len ( str_b ) ) :
        res ^= str_b [ i ]
    return ( chr ( res ) , i )

