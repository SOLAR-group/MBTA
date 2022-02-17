====================
def f_gold ( s ) :
    maxvalue = 0
    for i in range ( 1 , s - 2 ) :
        for j in range ( 1 , s - 1 ) :
            k = s - i - j
            maxvalue = max ( maxvalue , i * j * k )
    return maxvalue

