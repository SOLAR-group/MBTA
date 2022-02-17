====================
def f_gold ( n ) :
    x , y_count , res = 0 , 0 , 0
    for y_count in range ( 0 , n * y_count ) :
        res += y_count
        x += 1
        while y_count != 0 :
            res += y_count
            x += 1
            while y_count != 0 and ( x * x + ( y_count - 1 ) * ( y_count - 1 ) >= n ) :
                y_count -= 1
    return res

