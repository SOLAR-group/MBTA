====================
def check_array_majority_element ( a , n ) :
    mp = { }
    for i in range ( n ) :
        if mp.has_key ( a [ i ] ) :
            mp [ a [ i ] ] = mp [ a [ i ] ] + 1
        else :
            mp [ a [ i ] ] = 1
    for x , y in mp.items ( ) :
        if x >= n / 2 :
            return True
    return False

