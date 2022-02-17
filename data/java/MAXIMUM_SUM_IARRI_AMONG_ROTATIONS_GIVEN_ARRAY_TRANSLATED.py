====================
def f_gold ( arr , n ) :
    res = np.inf
    for i in range ( n ) :
        curr_sum = 0
        for j in range ( n ) :
            index = ( i + j ) % n
            curr_sum += j * arr [ index ]
        res = max ( res , curr_sum )
    return res

