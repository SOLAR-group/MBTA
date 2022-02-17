====================
def f_gold ( arr , n , x ) :
    curr_sum , min_len = 0 , n + 1
    start , end = 0 , 0
    while end < n :
        while curr_sum <= x and end < n :
            if curr_sum <= 0 and x > 0 :
                start = end
                curr_sum = 0
            curr_sum += arr [ end ]
        while curr_sum > x and start < n :
            if end - start < min_len :
                min_len = end - start
            curr_sum -= arr [ start ]
    return min_len

