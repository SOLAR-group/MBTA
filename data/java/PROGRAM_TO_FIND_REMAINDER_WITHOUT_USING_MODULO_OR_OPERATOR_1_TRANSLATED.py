====================
def f_gold ( num , divisor ) :
    if divisor == 0 :
        print ( "Error: divisor " + "can't be zero \n" )
        return - 1
    if divisor < 0 :
        divisor = - divisor
    if num < 0 :
        num = - num
    i = 1
    product = 0
    while product <= num :
        product = divisor * i
        i += 1
    return num - ( product - divisor )

