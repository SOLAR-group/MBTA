====================
def f_gold ( arr , n ) :
    res = np.inf
    for i in range ( n ) :
        prefix_sum = arr [ i ]
        for j in range ( i ) :
            prefix_sum += arr [ j ]
        suffix_sum = arr [ i ]
        for j in range ( n - 1 , i , - 1 ) :
            suffix_sum += arr [ j ]
        if prefix_sum == suffix_sum :
            res = max ( res , prefix_sum )
    return res

