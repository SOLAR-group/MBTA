====================
def f_gold ( start , end , arr ) :
    mp = { }
    for i in range ( start , end + 1 ) :
        mp [ arr [ i ] ] = mp [ arr [ i ] ] if i in mp else 1
    count = 0
    for key , value in mp.items ( ) :
        if key == arr [ end ] :
            count += 1
    return count

