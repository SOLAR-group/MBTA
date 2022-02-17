====================
def f_gold ( arr , n ) :
    m = { }
    for i in range ( n ) :
        if m.has_key ( arr [ i ] ) :
            m [ arr [ i ] ] = m [ arr [ i ] ] + 1
        else :
            m [ arr [ i ] ] = 1
    for i in range ( n ) :
        if m [ arr [ i ] ] == 1 :
            return arr [ i ]
    return - 1

