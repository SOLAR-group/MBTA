if __name__ == '__main__':
    param = [
    ([2, 2, 2, 7, 10, 14, 24, 38, 42, 50, 59, 60, 72, 73, 79, 83, 89],9,),
    ([-48, 98, 96, -56, -2, 58, 52, -50, 58, 50, 62, 86, -26, -98, 34, 20, -28, 56, -36],9,),
    ([0, 0, 0, 0, 0, 0, 0, 0, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1],20,),
    ([91, 50, 37],2,),
    ([-80, -26, 0, 0, 6, 14, 22, 76, 82, 88, 98],10,),
    ([1, 0],1,),
    ([9, 24, 24, 33, 48, 50, 55, 61, 69, 79, 83],8,),
    ([30, 32, -82, -48, 88, -24, 74, 2, 90, 98, 68, 82, 32, -60, 2, -94, 18, 14, 46, 50, -60, -74, -76, 66, -76, -34, -20, 82, -44, -62, 34, 48, -56, 2, 64, -78, -64, 98, -10, -28, 78, -42],27,),
    ([0, 0, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1],6,),
    ([38, 74, 99, 75, 44, 75, 24, 70, 78, 74, 60, 59, 34, 27, 7, 23, 19, 95, 4, 35, 38, 22, 46, 1, 44, 20, 52, 1, 96, 57, 5, 76, 49, 1, 37, 35],31,)
        ]
    n_success = 0
    for i, parameters_set in enumerate(param):
        try:
            if f_filled(*parameters_set) == f_gold(*parameters_set):
                print("HOW_TO_CHECK_IF_A_GIVEN_ARRAY_REPRESENTS_A_BINARY_HEAP_1," + sys.argv[1] + "," + str(i) + ",SUCCESS")
            else:
                print("HOW_TO_CHECK_IF_A_GIVEN_ARRAY_REPRESENTS_A_BINARY_HEAP_1," + sys.argv[1] + "," + str(i) + ",FAILURE")
        except:
            print("HOW_TO_CHECK_IF_A_GIVEN_ARRAY_REPRESENTS_A_BINARY_HEAP_1," + sys.argv[1] + "," + str(i) + ",EXCEPTION")
