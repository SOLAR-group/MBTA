====================
def f_gold ( arr , n ) :
    sum = 0
    s = set ( )
    for i in range ( n ) :
        if not s.issubset ( arr [ i ] ) :
            sum += arr [ i ]
            s.add ( arr [ i ] )
    return sum

