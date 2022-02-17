====================
def f_gold ( arr , n ) :
    fw = [ ]
    bw = [ ]
    cur_max , max_so_far = arr [ 0 ] , arr [ 0 ]
    fw.append ( arr [ 0 ] )
    for i in range ( 1 , n ) :
        cur_max = max ( arr [ i ] , cur_max + arr [ i ] )
        max_so_far = max ( max_so_far , cur_max )
        fw.append ( cur_max )
    cur_max = max_so_far = bw [ n - 1 ] = arr [ n - 1 ]
    for i in range ( n - 2 , - 1 , - 1 ) :
        cur_max = max ( arr [ i ] , cur_max + arr [ i ] )
        max_so_far = max ( max_so_far , cur_max )
        bw.append ( cur_max )
    fans = max_so_far
    for i in range ( 1 , n - 1 ) :
        fans = max ( fans , fw [ i - 1 ] + bw [ i + 1 ] )
    return fans

