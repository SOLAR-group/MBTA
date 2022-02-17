====================
def f_gold ( n ) :
    prev_prev , prev , curr = 1 , 2 , 3
    while n > 0 :
        prev_prev , prev , curr = prev , curr , prev_prev + prev
        n = n - ( curr - prev - 1 )
    n = n + ( curr - prev - 1 )
    return prev + n

