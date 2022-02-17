====================
def f_gold ( n ) :
    count = 0
    x = n & ( n - 1 )
    if n > 0 and x == 0 :
        while n > 1 :
            n >>= 1
            count += 1
        return ( count % 2 == 0 )
    return 0

