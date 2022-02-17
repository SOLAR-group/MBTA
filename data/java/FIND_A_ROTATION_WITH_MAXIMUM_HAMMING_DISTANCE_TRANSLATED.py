====================
def find_a_rotation_with_maximum_hamming_distance ( arr , n ) :
    brr = [ arr [ i ] for i in range ( 2 * n + 1 ) ]
    for i in range ( n ) :
        brr [ n + i ] = arr [ i ]
    max_ham = 0
    for i in range ( 1 , n ) :
        curr_ham = 0
        for j , k in enumerate ( ( i , n ) ) :
            if brr [ j ] != arr [ k ] :
                curr_ham += 1
        if curr_ham == n :
            return n
        max_ham = max ( max_ham , curr_ham )
    return max_ham

