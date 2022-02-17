====================
def next_power_of_2_1 ( n ) :
    p = 1
    if n and ( n & ( n - 1 ) ) == 0 :
        return n
    while p < n :
        p <<= 1
    return p

