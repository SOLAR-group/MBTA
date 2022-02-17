====================
def f_gold ( arr , n ) :
    high = 0
    for i in range ( n ) :
        high = max ( high , arr [ i ] )
    divisors = [ 0 ] * ( high + 1 )
    for i in range ( n ) :
        for j in range ( 1 , math.sqrt ( arr [ i ] ) ) :
            if arr [ i ] % j == 0 :
                divisors [ j ] += 1
                if j != arr [ i ] / j :
                    divisors [ arr [ i ] / j ] += 1
    for i in range ( high , 1 , - 1 ) :
        if divisors [ i ] > 1 :
            return i
        return 1

