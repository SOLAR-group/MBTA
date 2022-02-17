====================
def f_gold ( a , n ) :
    count = { }
    for i in range ( n ) :
        if count.has_key ( a [ i ] ) :
            count [ a [ i ] ] = count [ a [ i ] ] + 1
        else :
            count [ a [ i ] ] = 1
    next_missing = 1
    for i in range ( n ) :
        if count.has_key ( a [ i ] ) and count [ a [ i ] ] != 1 or a [ i ] > n or a [ i ] < 1 :
            count [ a [ i ] ] = count [ a [ i ] ] - 1
            while count.has_key ( next_missing ) :
                next_missing += 1
            a [ i ] = next_missing
            count [ next_missing ] = 1
    return count

