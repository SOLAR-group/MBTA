====================
def f_gold ( arr , n ) :
    count = 0
    arr = np.array ( arr , dtype = np.int32 )
    for i in range ( n - 1 ) :
        if arr [ i ] != arr [ i + 1 ] and arr [ i ] != arr [ i + 1 ] - 1 :
            count += arr [ i + 1 ] - arr [ i ] - 1
    return count

