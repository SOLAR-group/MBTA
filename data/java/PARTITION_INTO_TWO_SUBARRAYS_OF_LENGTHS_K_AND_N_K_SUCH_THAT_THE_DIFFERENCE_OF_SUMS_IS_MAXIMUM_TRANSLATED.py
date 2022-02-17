====================
def f_gold ( arr , N , k ) :
    M , S , S1 , max_difference = 0 , 0 , 0 , 0
    for i in range ( N ) :
        S += arr [ i ]
    temp = 0
    for i in range ( N ) :
        for j in range ( i + 1 , N ) :
            if arr [ i ] < arr [ j ] :
                temp = arr [ i ]
                arr [ i ] , arr [ j ] = arr [ j ] , temp
    M = max ( k , N - k )
    for i in range ( M ) :
        S1 += arr [ i ]
    max_difference = S1 - ( S - S1 )
    return max_difference

