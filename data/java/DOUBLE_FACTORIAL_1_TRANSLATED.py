====================
def double_factorial_1 ( n ) :
    res = 1
    for i in range ( n , - 1 , - 1 ) :
        if i == 0 or i == 1 :
            return res
        else :
            res *= i
    return res

