====================
def f_gold ( arr , n , sum ) :
    """
 Return the sum of the subarray with given number of subarrays.
 """
    curr_sum , i , j = 0 , 0 , 0
    for i in range ( n ) :
        curr_sum = arr [ i ]
        for j in range ( i + 1 , n ) :
            if curr_sum == sum :
                p = j - 1
                print ( "Sum found between indexes %d and %d" % ( i , p ) )
                return 1
            if curr_sum > sum or j == n :
                break
            curr_sum = curr_sum + arr [ j ]
    print ( "No subarray found" )
    return 0

