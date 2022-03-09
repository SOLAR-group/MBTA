import sys

def f_gold ( arr , n ) :
    um = { }
    sum , max_len = 0 , 0
    for i in range ( n ) :
        sum += arr [ i ] if i > 0 else - 1
        if sum == 1 :
            max_len = i + 1
        elif not um.has_key ( sum ) :
            um [ sum ] = i
        if um.has_key ( sum - 1 ) :
            if max_len < ( i - um [ sum - 1 ] ) :
                max_len = i - um [ sum - 1 ]
    return max_len

if __name__ == '__main__':
    param = [
    ([6, 10, 31, 35],2,),
    ([4, 88, -72, 28, -54, 32, -34],6,),
    ([0, 0, 0, 1, 1, 1, 1, 1, 1],4,),
    ([39, 22, 15, 10, 34, 87, 46, 83, 74, 77, 61, 90, 43, 67, 64, 72, 92, 52, 68, 53, 67, 32, 82, 76, 76, 47, 74, 47, 8, 80, 85, 58, 75],26,),
    ([-82, -58, -50, -30, -14, -4, -2, -2, 0, 22, 36, 58, 70, 80, 80, 82, 84, 90],14,),
    ([1, 0, 1, 0, 0, 1, 1, 1, 0, 0, 1],7,),
    ([4, 11, 17, 21, 21, 22, 30, 31, 36, 37, 39, 40, 45, 46, 47, 48, 52, 53, 53, 60, 60, 65, 66, 66, 67, 67, 87, 88, 91, 97],29,),
    ([-4, -60, -78, -50, 64, 18, 0, 76, 12, 86, -22],7,),
    ([0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 1, 1, 1, 1, 1, 1, 1, 1, 1],17,),
    ([4, 39, 50, 37, 71, 66, 55, 34, 1, 41, 34, 99, 69, 31],11,)
        ]
    n_success = 0
    print("class,mutant,test_index,result")
    for i, parameters_set in enumerate(param):
        try:
            print("LONGEST_SUBARRAY_COUNT_1S_ONE_COUNT_0S," + sys.argv[1] + "," + str(i) + "," + str(f_gold(*parameters_set)))
        except:
            print("LONGEST_SUBARRAY_COUNT_1S_ONE_COUNT_0S," + sys.argv[1] + "," + str(i) + ",EXCEPTION")
