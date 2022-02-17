====================
def f_gold ( A , arr_size , sum ) :
    for i in range ( arr_size - 2 ) :
        s = set ( )
        curr_sum = sum - A [ i ]
        for j in range ( i + 1 , arr_size ) :
            if s.count ( curr_sum - A [ j ] ) > 0 and curr_sum - A [ j ] not in ( s.pop ( ) , s.pop ( ) ) :
                print ( "Triplet is %d, %d, %d" % ( A [ i ] , A [ j ] , curr_sum - A [ j ] ) )
                return True
            s.add ( A [ j ] )
    return False

