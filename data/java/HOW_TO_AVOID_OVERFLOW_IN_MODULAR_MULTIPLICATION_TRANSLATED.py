====================
def f_gold ( a , b , mod ) :
    res = 0
    a = a % mod
    while b :
        if b % 2 == 1 :
            res = ( res + a ) % mod
        a = ( a * 2 ) % mod
        b /= 2
    return res % mod

