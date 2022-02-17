====================
def f_gold ( arr , n , k ) :
    hash = { }
    for i in range ( n ) :
        if not hash.has_key ( arr [ i ] ) :
            hash [ arr [ i ] ] = 0
        hash [ arr [ i ] ] = hash [ arr [ i ] ] + 1
    for x in hash.items ( ) :
        if int ( x ) > 2 ** k :
            return False
        return True

