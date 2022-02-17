====================
def f_gold ( num ) :
    if num < 0 :
        return False
    sum = 0
    for n in range ( 1 , num + 1 ) :
        sum = sum + n
        if sum == num :
            return True
    return False

