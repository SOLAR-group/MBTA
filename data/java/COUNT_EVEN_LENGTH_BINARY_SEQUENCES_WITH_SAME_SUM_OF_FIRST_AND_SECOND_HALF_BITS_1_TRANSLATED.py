====================
def f_gold ( n ) :
    nCr , res = 1 , 1
    for r in range ( 1 , n + 1 ) :
        nCr = ( nCr * ( n + 1 - r ) ) / r
        res += nCr ** 2
    return res

