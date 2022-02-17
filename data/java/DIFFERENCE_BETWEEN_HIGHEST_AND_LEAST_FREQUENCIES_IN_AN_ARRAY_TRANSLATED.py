====================
def f_gold ( arr , n ) :
    arr = np.asarray ( arr )
    count , max_count , min_count = 0 , 0 , n
    for i in range ( ( n - 1 ) ) :
        if arr [ i ] == arr [ i + 1 ] :
            count += 1
            continue
        else :
            max_count = max ( max_count , count )
            min_count = min ( min_count , count )
            count = 0
    return ( max_count - min_count ) , ( max_count - min_count ) , ( min_count - max_count )

