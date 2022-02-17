====================
def _minimum_number_of_jump_to_REACH_END_OF_A_GIVEN_ARRAY_1 ( arr , n ) :
    jumps = [ ]
    i , j = 0 , 0
    if n == 0 or arr [ 0 ] == 0 :
        return int ( '' )
    jumps.append ( 0 )
    for i in range ( 1 , n ) :
        jumps.append ( int ( '' ) )
        for j in range ( i ) :
            if i <= j + arr [ j ] and jumps [ j ] != int ( '' ) :
                jumps [ i ] = min ( jumps [ i ] , jumps [ j ] + 1 )
                break
    return jumps [ - 1 ]

