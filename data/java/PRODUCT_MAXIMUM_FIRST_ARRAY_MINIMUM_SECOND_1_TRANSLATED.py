====================
def f_gold ( arr1 , arr2 , n1 , n2 ) :
    max = arr1 [ 0 ]
    min = arr2 [ 0 ]
    i = 0
    for i in range ( 1 , n1 and i < n2 ) :
        if arr1 [ i ] > max :
            max = arr1 [ i ]
        if arr2 [ i ] < min :
            min = arr2 [ i ]
    while i < n1 :
        if arr1 [ i ] > max :
            max = arr1 [ i ]
        i += 1
    while i < n2 :
        if arr2 [ i ] < min :
            min = arr2 [ i ]
        i += 1
    return max * min

