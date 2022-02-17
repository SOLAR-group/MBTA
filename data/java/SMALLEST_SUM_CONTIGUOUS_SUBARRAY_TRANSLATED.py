====================
def f_gold ( arr , n ) :
    min_ending_here = 2147483647
    min_so_far = 2147483647
    for i in range ( n ) :
        if min_ending_here > 0 :
            min_ending_here = arr [ i ]
        else :
            min_ending_here += arr [ i ]
        min_so_far = min ( min_so_far , min_ending_here )
    return min_so_far

