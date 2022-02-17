====================
def f_gold ( weight , n , c ) :
    res , bin_rem = 0 , c
    for i in range ( n ) :
        if weight [ i ] > bin_rem :
            res += 1
            bin_rem = c - weight [ i ]
        else :
            bin_rem -= weight [ i ]
    return res , bin_rem

