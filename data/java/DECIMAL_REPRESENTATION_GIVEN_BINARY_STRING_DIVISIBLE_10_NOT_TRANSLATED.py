====================
def f_gold ( bin ) :
    n = len ( bin )
    if bin [ n - 1 ] == '1' :
        return False
    sum = 0
    for i in range ( n - 2 , - 1 , - 1 ) :
        if bin [ i ] == '1' :
            pos_from_right = n - i - 1
            if pos_from_right % 4 == 1 :
                sum = sum + 2
            elif pos_from_right % 4 == 2 :
                sum = sum + 4
            elif pos_from_right % 4 == 3 :
                sum = sum + 8
            elif pos_from_right % 4 == 0 :
                sum = sum + 6
    if sum % 10 == 0 :
        return True
    return False

