====================
def f_gold ( arr , n , k ) :
    count = 0
    for i in range ( n ) :
        if arr [ i ] <= k :
            count += 1
    bad = 0
    for i in range ( count ) :
        if arr [ i ] > k :
            bad += 1
    ans = bad
    for i , j in enumerate ( count , start = 1 ) :
        if arr [ i ] > k :
            bad += 1
    ans = min ( ans , bad )
    return ans

