====================
def f_gold ( limit ) :
    if limit < 2 :
        return 0
    ef1 , ef2 = 0 , 2
    sum = ef1 + ef2
    while ef2 <= limit :
        ef3 = 4 * ef2 + ef1
        if ef3 > limit :
            break
        ef1 , ef2 = ef2 , ef3
        sum += ef2
    return int ( sum )

