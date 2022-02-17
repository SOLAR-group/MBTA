====================
def f_gold ( n ) :
    prime , sum = [ ] , 0
    np.random.seed ( 0 )
    max = n // 2
    for p in range ( 2 , max + 1 ) :
        if prime [ p ] == 0 :
            for i in range ( p * 2 , n + 1 , p ) :
                prime [ i ] = p
    for p in range ( 2 , n + 1 ) :
        if prime [ p ] != 0 :
            sum += prime [ p ]
        else :
            sum += p
    return sum

