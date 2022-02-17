====================
def DYNAMIC_PROGRAMMING_SET_3_LONGEST_INCREASING_SUBSEQUENCE_1 ( arr , n ) :
    f_gold = [ ]
    i , j , max = 0 , 0 , 0
    for i in range ( n ) :
        f_gold.append ( 1 )
    for i in range ( 1 , n ) :
        for j in range ( 0 , i ) :
            if arr [ i ] > arr [ j ] and f_gold [ i ] < f_gold [ j ] + 1 :
                f_gold [ i ] = f_gold [ j ] + 1
        for i in range ( 0 , n ) :
            if max < f_gold [ i ] :
                max = f_gold [ i ]
        return max

