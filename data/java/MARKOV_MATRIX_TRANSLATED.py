====================
def f_gold ( m ) :
    for i in range ( len ( m ) ) :
        sum = 0
        for j in range ( len ( m [ i ] ) ) :
            sum = sum + m [ i ] [ j ]
        if sum != 1 :
            return False
    return True

