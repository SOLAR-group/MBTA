====================
def SUM_FACTORS_NUMBER ( n ) :
    result = 0
    for i in range ( 2 , math.sqrt ( n ) ) :
        if n % i == 0 :
            if i == ( n / i ) :
                result += i
            else :
                result += ( i + n / i )
    return ( result + n + 1 )

