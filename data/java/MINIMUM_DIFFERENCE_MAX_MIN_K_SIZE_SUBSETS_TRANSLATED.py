====================
def f_gold ( arr , N , K ) :
    arr = np.asarray ( arr )
    res = 2147483647
    for i in range ( 0 , ( N - K ) ) :
        cur_seq_diff = arr [ i + K - 1 ] - arr [ i ]
        res = min ( res , cur_seq_diff )
    return res

