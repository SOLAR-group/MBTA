import sys

def f_gold ( arr , n ) :
    """
 Return the number of possible differences between two sets of subseps.
 """
    SubsetSum_1 , SubsetSum_2 = 0 , 0
    for i in range ( 0 , n - 1 ) :
        is_single_occurrence = True
        for j in range ( i + 1 , n - 1 ) :
            if arr [ i ] == arr [ j ] :
                is_single_occurrence = False
                arr [ i ] , arr [ j ] = arr [ i ] , arr [ j ]
                break
        if is_single_occurrence :
            if arr [ i ] > 0 :
                SubsetSum_1 += arr [ i ]
            else :
                SubsetSum_2 += arr [ i ]
    return abs ( SubsetSum_1 - SubsetSum_2 )

if __name__ == '__main__':
    param = [
    ([5, 14, 15, 21, 42, 42, 42, 46, 46, 48, 48, 48, 52, 52, 53, 60, 62, 69, 69, 79, 82, 86, 96],15,),
    ([-54, 4, -22, 94, 58, -28, -12, 84, 64, 4, -34, 16, -10, -32, 50, -78, 68, -52, -64, 66, 64, -28, -38, -18, -84, -66, -36, 64, -12, 44, 48, 8, 42],28,),
    ([0, 0, 0, 1],2,),
    ([63, 49, 18, 36, 21, 30, 45, 87],6,),
    ([-96, -78, -78, -72, -62, -56, -52, -44, -38, -38, -28, -22, -20, -12, -6, -6, -2, 2, 2, 4, 36, 44, 46, 50, 50, 54, 66, 92],18,),
    ([0, 1, 1, 0, 0, 1, 1, 0, 1, 1, 1, 0, 0, 1, 1, 0, 0, 0, 0, 1, 1, 0, 0, 1, 1, 1, 0, 1, 0, 0, 1, 0, 0, 1, 0, 1, 0, 0, 1, 1, 1, 0],34,),
    ([1, 2, 8, 12, 13, 13, 14, 17, 18, 27, 28, 31, 34, 37, 38, 42, 43, 45, 49, 52, 53, 56, 56, 58, 62, 66, 71, 74, 87, 93, 96, 99],25,),
    ([30, -28, -30, 86, -8, -80, 76, -2, 28, 30, 82, 84, -32, 82, -88, -24, 42, 16, -32, -8, 78, -8, -46, -6, -86, -86, -24, -12, -32, -72, 84, -82, 76, -84, 80, -50, 90, -50, -14, -82, 78, 48, -10, 86, 34, -20, -76, 58],28,),
    ([0, 1],1,),
    ([83, 86, 57, 18, 98, 52, 1, 37, 11, 49, 10, 67, 2, 60, 30, 42, 8, 97, 25, 55, 5, 75, 9, 67],16,)
        ]
    n_success = 0
    print("class,mutant,test_index,result")
    for i, parameters_set in enumerate(param):
        try:
            print("MAXIMUM_POSSIBLE_DIFFERENCE_TWO_SUBSETS_ARRAY," + sys.argv[1] + "," + str(i) + "," + str(f_gold(*parameters_set)))
        except:
            print("MAXIMUM_POSSIBLE_DIFFERENCE_TWO_SUBSETS_ARRAY," + sys.argv[1] + "," + str(i) + ",EXCEPTION")
