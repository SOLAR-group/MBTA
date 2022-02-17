====================
def count_minimum_numbersubsets_subsequences__consecutive_NUMBERS ( arr , n ) :
    arr = np.array ( arr )
    count = 1
    for i in range ( n - 1 ) :
        if arr [ i ] + 1 != arr [ i + 1 ] :
            count += 1
    return count

