====================
def f_gold ( arr , n , sum ) :
    """
 Return the sum of the subarray with given number of subarrays.
 """
    curr_sum , start , i = arr [ 0 ] , 0 , 0
    for i in range ( 1 , n + 1 ) :
        while curr_sum > sum and start < i - 1 :
            curr_sum = curr_sum - arr [ start ]
            start += 1
        if curr_sum == sum :
            p = i - 1
            print ( "Sum found between indexes %d and %d" % ( start , p ) )
            return 1
        if i < n :
            curr_sum = curr_sum + arr [ i ]
    print ( "No subarray found" )
    return 0

