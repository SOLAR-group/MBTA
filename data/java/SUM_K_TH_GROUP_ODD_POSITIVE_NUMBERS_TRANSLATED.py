====================
def get_sum_k_th_group_odd_positive_numbers ( k ) :
    cur = ( k * ( k - 1 ) ) + 1
    sum = 0
    while k :
        sum += cur
        cur += 2
    return sum

