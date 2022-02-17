====================
def f_gold ( arr , n ) :
    um = { }
    sum , max_len = 0 , 0
    for i in range ( n ) :
        sum += arr [ i ] if i > 0 else - 1
        if sum == 1 :
            max_len = i + 1
        elif not um.has_key ( sum ) :
            um [ sum ] = i
        if um.has_key ( sum - 1 ) :
            if max_len < ( i - um [ sum - 1 ] ) :
                max_len = i - um [ sum - 1 ]
    return max_len

