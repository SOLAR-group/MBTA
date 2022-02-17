====================
def f_gold ( notes , n ) :
    five_count = 0
    ten_count = 0
    for i in range ( n ) :
        if notes [ i ] == 5 :
            five_count += 1
        elif notes [ i ] == 10 :
            if five_count > 0 :
                five_count -= 1
                ten_count += 1
            else :
                return 0
        else :
            if five_count > 0 and ten_count > 0 :
                five_count -= 1
                ten_count -= 1
            elif five_count >= 3 :
                five_count -= 3
            else :
                return 0
        return 1

