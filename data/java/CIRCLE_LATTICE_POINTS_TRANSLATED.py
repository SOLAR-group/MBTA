====================
def f_gold ( r ) :
    if r <= 0 :
        return 0
    result = 4
    for x in range ( 1 , r ) :
        y_square = r ** 2 - x ** 2
        y = int ( math.sqrt ( y_square ) )
        if y * y == y_square :
            result += 4
    return result

