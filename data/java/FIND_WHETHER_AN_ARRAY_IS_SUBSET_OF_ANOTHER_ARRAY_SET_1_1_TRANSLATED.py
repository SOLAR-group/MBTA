====================
def f_gold ( arr1 , arr2 , m , n ) :
    i , j = 0 , 0
    if m < n :
        return False
    arr1.sort ( )
    arr2.sort ( )
    while i < n and j < m :
        if arr1 [ j ] < arr2 [ i ] :
            j += 1
        elif arr1 [ j ] == arr2 [ i ] :
            j += 1
            i += 1
        elif arr1 [ j ] > arr2 [ i ] :
            return False
    if i < n :
        return False
    else :
        return True

