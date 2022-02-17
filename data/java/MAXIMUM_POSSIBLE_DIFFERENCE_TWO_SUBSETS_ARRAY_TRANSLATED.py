====================
def f_gold ( arr , n ) :
    """
 Return the number of possible differences between two sets of subseps.
 """
    SubsetSum_1 , SubsetSum_2 = 0 , 0
    for i in range ( 0 , n - 1 ) :
        is_single_occurrence = True
        for j in range ( i + 1 , n - 1 ) :
            if arr [ i ] == arr [ j ] :
                is_single_occurrence = False
                arr [ i ] , arr [ j ] = arr [ i ] , arr [ j ]
                break
        if is_single_occurrence :
            if arr [ i ] > 0 :
                SubsetSum_1 += arr [ i ]
            else :
                SubsetSum_2 += arr [ i ]
    return abs ( SubsetSum_1 - SubsetSum_2 )

