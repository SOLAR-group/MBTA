====================
def get_sum_of_elements ( n ) :
    ans = 0
    for i in range ( 1 , n + 1 ) :
        for j in range ( 1 , n + 1 ) :
            ans += ( i / j )
    return ans

