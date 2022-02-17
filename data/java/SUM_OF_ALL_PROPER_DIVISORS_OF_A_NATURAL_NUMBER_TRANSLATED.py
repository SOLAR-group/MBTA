====================
def f_gold ( num ) :
    result = 0
    for i in range ( 2 , math.sqrt ( num ) ) :
        if num % i == 0 :
            if i == ( num / i ) :
                result += i
            else :
                result += ( i + num / i )
    return ( result + 1 )

