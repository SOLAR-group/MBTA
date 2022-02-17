====================
def f_gold ( n ) :
    res = 0
    for x in range ( 0 , n ) :
        for y in range ( 0 , x + y * n ) :
            res += 1
    return res

