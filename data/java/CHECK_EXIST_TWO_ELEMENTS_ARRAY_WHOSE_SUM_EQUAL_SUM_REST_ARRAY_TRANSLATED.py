====================
def f_gold ( arr , n ) :
    sum = 0
    for i in range ( n ) :
        sum += arr [ i ]
    if sum % 2 != 0 :
        return False
    sum = sum / 2
    s = set ( )
    for i in range ( n ) :
        val = sum - arr [ i ]
        if s.add ( val ) and val in ( s.pop ( ) , s.pop ( ) ) :
            print ( "Pair elements are %d and %d" % ( arr [ i ] , val ) )
            return True
        s.add ( arr [ i ] )
    return False

