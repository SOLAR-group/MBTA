====================
def f_gold ( arr , n , k ) :
    um = { }
    sum = [ ]
    curr_rem = 0
    max_sum = 0
    sum.append ( arr [ 0 ] )
    for i in range ( 1 , n ) :
        sum [ i ] = sum [ i - 1 ] + arr [ i ]
    for i in range ( 0 , n ) :
        curr_rem = sum [ i ] % k
        if curr_rem == 0 :
            if max_sum < sum [ i ] :
                max_sum = sum [ i ]
        elif not um.has_key ( curr_rem ) :
            um [ curr_rem ] = i
        elif max_sum < ( sum [ i ] - sum [ um [ curr_rem ] ] ) :
            max_sum = sum [ i ] - sum [ um [ curr_rem ] ]
    return ( max_sum / k )

