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
    for i, parameters_set in enumerate(param):
        try:
            if f_filled(*parameters_set) == f_gold(*parameters_set):
                print("LARGEST_SUBARRAY_WITH_EQUAL_NUMBER_OF_0S_AND_1S_1," + sys.argv[1] + "," + str(i) + ",SUCCESS")
            else:
                print("LARGEST_SUBARRAY_WITH_EQUAL_NUMBER_OF_0S_AND_1S_1," + sys.argv[1] + "," + str(i) + ",FAILURE")
        except:
            print("LARGEST_SUBARRAY_WITH_EQUAL_NUMBER_OF_0S_AND_1S_1," + sys.argv[1] + "," + str(i) + ",EXCEPTION")
