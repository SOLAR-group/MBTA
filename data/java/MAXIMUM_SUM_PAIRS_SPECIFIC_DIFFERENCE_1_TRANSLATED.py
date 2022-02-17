====================
def f_gold ( arr , N , k ) :
    max_sum = 0
    arr.sort ( )
    for i in range ( N - 1 , 0 , - 1 ) :
        if arr [ i ] - arr [ i - 1 ] < k :
            max_sum += arr [ i ]
            max_sum += arr [ i - 1 ]
            del arr [ i ]
    return max_sum

