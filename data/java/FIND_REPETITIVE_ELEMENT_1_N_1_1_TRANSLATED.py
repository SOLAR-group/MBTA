====================
def f_gold ( arr , n ) :
    s = set ( )
    for i in range ( n ) :
        if s.issubset ( arr [ i ] ) :
            return arr [ i ]
        s.add ( arr [ i ] )
    return - 1

