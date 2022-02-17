====================
def f_gold ( arr , n ) :
    s = set ( )
    first , second = 0 , 0
    for i in range ( n ) :
        if not s.issubset ( arr [ i ] ) :
            s.add ( arr [ i ] )
            continue
        if arr [ i ] > first :
            second = first
            first , second = arr [ i ] , arr [ i ]
        elif arr [ i ] > second :
            second , first = arr [ i ] , arr [ i ]
    return ( first , second )

