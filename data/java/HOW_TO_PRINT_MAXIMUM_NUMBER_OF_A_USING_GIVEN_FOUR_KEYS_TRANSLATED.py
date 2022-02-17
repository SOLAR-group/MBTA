====================
def f_gold ( N ) :
    if N <= 6 :
        return N
    screen = [ ]
    b = 0
    n = 0
    for n in range ( 1 , 6 ) :
        screen.append ( n )
    for n in range ( 7 , N ) :
        screen.append ( max ( 2 * screen [ n - 4 ] , max ( 3 * screen [ n - 5 ] , 4 * screen [ n - 6 ] ) ) )
    return screen [ N - 1 ]

