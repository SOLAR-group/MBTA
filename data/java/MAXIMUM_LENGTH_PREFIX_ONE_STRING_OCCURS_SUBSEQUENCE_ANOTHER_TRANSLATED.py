====================
def f_gold ( s , t ) :
    count = 0
    for c in t :
        if count == len ( t ) :
            break
        if c == s [ count ] :
            count += 1
    return count

