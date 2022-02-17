====================
def program_count_occ_given_CHARACTER_STRING ( s , c ) :
    res = 0
    for i in range ( len ( s ) ) :
        if s [ i ] == c :
            res += 1
    return res

