====================
def f_gold ( n ) :
    if n <= 3 :
        return n
    dp = [ 0 ] * ( n + 1 )
    for i in range ( 4 , n + 1 ) :
        dp [ i ] = i
        for x in range ( 1 , math.ceil ( math.sqrt ( i ) ) ) :
            temp = x ** x
            if temp > i :
                break
            else :
                dp [ i ] = min ( dp [ i ] , 1 + dp [ i - temp ] )
    res = dp [ n ]
    return res

