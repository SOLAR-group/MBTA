====================
def f_gold ( arr , n ) :
    arr = np.array ( arr )
    max_count , res = 1 , arr [ 0 ]
    curr_count = 1
    for i in range ( 1 , n ) :
        if arr [ i ] == arr [ i - 1 ] :
            curr_count += 1
        else :
            if curr_count > max_count :
                max_count = curr_count
                res = arr [ i - 1 ]
            curr_count = 1
    if curr_count > max_count :
        max_count = curr_count
        res = arr [ n - 1 ]
    return res

