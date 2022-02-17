====================
def f_gold ( arr1 , arr2 , n ) :
    index = n
    left , right = 0 , n - 1
    while left <= right :
        mid = ( left + right ) // 2
        if arr2 [ mid ] == arr1 [ mid ] :
            left = mid + 1
        else :
            index = mid
            right = mid - 1
    return index

