====================
def f_gold ( arr , n ) :
    i = 0
    ans = int ( 0 )
    maxval = 1
    minval = 1
    prev_max = 0
    for i in range ( n ) :
        if arr [ i ] > 0 :
            maxval = maxval * arr [ i ]
            minval = min ( 1 , minval * arr [ i ] )
        elif arr [ i ] == 0 :
            minval = 1
            maxval = 0
        elif arr [ i ] < 0 :
            prev_max = maxval
            maxval = minval * arr [ i ]
            minval = prev_max * arr [ i ]
        ans = max ( ans , maxval )
        if maxval <= 0 :
            maxval = 1
    return ans

