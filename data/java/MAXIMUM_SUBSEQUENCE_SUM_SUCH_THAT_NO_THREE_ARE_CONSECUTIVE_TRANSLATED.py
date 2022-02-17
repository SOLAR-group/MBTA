====================
def f_gold ( arr , n ) :
    sum = [ ]
    if n >= 1 :
        sum.append ( arr [ 0 ] )
    if n >= 2 :
        sum.append ( arr [ 0 ] + arr [ 1 ] )
    if n > 2 :
        sum = max ( sum )
    for i in range ( 3 , n ) :
        sum = max ( max ( sum [ i - 1 ] , sum [ i - 2 ] + arr [ i ] ) , arr [ i ] + arr [ i - 1 ] + sum [ i - 3 ] )
    return sum [ n - 1 ]

