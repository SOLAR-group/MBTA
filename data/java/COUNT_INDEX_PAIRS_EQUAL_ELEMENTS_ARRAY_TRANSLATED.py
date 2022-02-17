====================
def count_index_pairs_equal_ELEMENTS_ARRAY ( arr , n ) :
    ans = 0
    for i in range ( n ) :
        for j in range ( i + 1 , n ) :
            if arr [ i ] == arr [ j ] :
                ans += 1
        return ans

