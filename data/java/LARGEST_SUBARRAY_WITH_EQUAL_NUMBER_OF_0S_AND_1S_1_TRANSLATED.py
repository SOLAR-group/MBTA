import sys

def f_gold ( arr , n ) :
    """
 Return the number of gold elements in the given array.

 Parameters
 -----
 arr : array
 Input array.
 n : int
 Number of elements to return.

 Returns
 -----
 n : int
 Number of gold elements in the given array.
 """
    hM = { }
    sum = 0
    max_len = 0
    ending_index = - 1
    start_index = 0
    for i in range ( n ) :
        arr [ start_index : start_index + n ] = ( arr [ start_index : start_index + n ] == 0 )
    for i in range ( n ) :
        sum += arr [ i ]
        if sum == 0 :
            max_len = i + 1
            ending_index = i
        if hM.has_key ( sum + n ) :
            if max_len < i - hM [ sum + n ] :
                max_len = i - hM [ sum + n ]
                ending_index = i
        else :
            hM [ sum + n ] = i
    for i in range ( n ) :
        arr [ start_index : start_index + n ] = ( arr [ start_index : start_index + n ] == - 1 )
    end = ending_index - max_len + 1
    print ( end , end )
    return max_len

if __name__ == '__main__':
    param = [
    ([3, 6, 16, 16, 18, 19, 22, 39, 40, 42, 60, 66, 69, 70, 70, 73, 74, 80, 99],9,),
    ([-88, -66],1,),
    ([0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1],19,),
    ([85, 98, 67, 27, 98, 13, 96, 32, 26, 44, 32],8,),
    ([-96, -94, -90, -88, -86, -66, -64, -52, -46, -46, -42, -40, -38, -32, -28, -22, -16, -10, -8, -8, -4, 2, 10, 26, 26, 28, 28, 40, 40, 42, 50, 60, 66, 68, 72, 74, 86, 92, 94],34,),
    ([1, 1, 1, 1, 1, 1, 0, 0, 0],4,),
    ([25, 64, 86],1,),
    ([-4, 78, -76, 12, 4, -38, -98, -26, -8, -98, 56, 0, -34, 36, -90, -36, 54, -68, 12, -44, 62, 60, -34, -52, 18],17,),
    ([0, 0, 0, 0, 0, 0, 0, 0, 1, 1, 1, 1, 1, 1, 1],9,),
    ([2, 25, 45, 98, 71, 8, 58, 94, 53],8,)
        ]
    n_success = 0
    print("class,mutant,test_index,result")
    for i, parameters_set in enumerate(param):
        try:
            print("LARGEST_SUBARRAY_WITH_EQUAL_NUMBER_OF_0S_AND_1S_1," + sys.argv[1] + "," + str(i) + "," + str(f_gold(*parameters_set)))
        except:
            print("LARGEST_SUBARRAY_WITH_EQUAL_NUMBER_OF_0S_AND_1S_1," + sys.argv[1] + "," + str(i) + ",EXCEPTION")
