import sys

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

if __name__ == '__main__':
    param = [
    ([4, 8, 8, 10, 15, 18, 19, 22, 25, 26, 30, 32, 35, 36, 40, 41, 43, 48, 53, 57, 59, 63, 64, 68, 71, 76, 76, 77, 78, 89, 96, 97],26,23,),
    ([-78, 16, -16, -10, -2, -38, 58, -72, -78, 50, -68, -16, -96, 82, 70, 2, -20],9,12,),
    ([0, 0, 0, 0, 0, 0, 0, 0, 1, 1, 1, 1, 1, 1],9,11,),
    ([16, 10, 55, 43, 46, 74, 57, 65, 86, 60, 28, 6, 92],10,6,),
    ([-98, -98, -90, -84, -84, -80, -76, -76, -70, -54, -48, -46, -44, -42, -38, -14, -12, -4, 6, 8, 24, 28, 32, 40, 40, 42, 64, 84, 98],23,19,),
    ([0, 1, 0, 0, 0, 1, 1, 0, 0, 0, 1, 0, 0, 0, 0, 0, 1],12,8,),
    ([2, 10, 40, 45, 56, 66, 66, 70, 75, 83, 93, 98],10,10,),
    ([-20, 30, 56, -68, 54, -6, 78, -86, 88, -66, 76, -66, 62, 78, 22, 46, -94, -10, 18, 16, -36, 34, -98, -84, -40, 98, 82, 10, 12, 54, -88],30,17,),
    ([0, 0, 1, 1],2,2,),
    ([38, 24, 12],1,1,)
        ]
    n_success = 0
    print("class,mutant,test_index,result")
    for i, parameters_set in enumerate(param):
        try:
            print("FIND_SUBARRAY_WITH_GIVEN_SUM," + sys.argv[1] + "," + str(i) + "," + str(f_gold(*parameters_set)))
        except:
            print("FIND_SUBARRAY_WITH_GIVEN_SUM," + sys.argv[1] + "," + str(i) + ",EXCEPTION")
