if __name__ == '__main__':
    param = [
    ([6, 11, 11, 14, 18, 19, 21, 22, 22, 23, 26, 27, 28, 28, 29, 30, 31, 34, 39, 42, 42, 44, 45, 49, 49, 53, 57, 61, 65, 66, 67, 70, 71, 73, 74, 74, 78, 85, 88, 94, 95, 97],37,23,),
    ([-30, -22, -66, -80, 18, -64, -28, -46, 94, 60, -64, 2, 26, -94, 58, 56, 56, 88, 50, -78, -12, 68, 54, -78, 42, -30, 24, -48, 84, 12, -88, 0, 54, -92, -4, 42, -60, -72, -32],31,29,),
    ([0, 0, 0, 0, 0, 0, 0, 1, 1, 1, 1, 1, 1, 1, 1],8,12,),
    ([86, 8, 23, 40, 55, 93, 11, 35, 33, 37, 96, 91, 35, 66, 37, 57, 83, 99, 96, 15, 18, 93],16,13,),
    ([-92, -68, -48, -48, -42, -26, -22, -18, 2, 4, 8, 14, 20, 22, 32, 46, 52, 62, 70, 96, 98],17,14,),
    ([0, 0, 0, 0, 1, 0, 1, 1, 0, 1, 0, 0, 0],11,10,),
    ([4, 4, 11, 11, 13, 15, 16, 18, 19, 19, 19, 23, 26, 27, 34, 39, 39, 40, 41, 46, 47, 51, 52, 52, 53, 57, 58, 58, 60, 64, 68, 70, 72, 84, 84, 85, 95, 98, 99],31,35,),
    ([12, -22, 2, -90, -92, 84, -26, -76, -72, 50, -36, 30, 78, -18, -94, -30, 22, 28, 10, 32, 34, -86, 0, -4, 40, 0, 80, 50, 66, -48, -40, -94, 64, 58, -14, 0, -32, -58, -22, -94, -68, -36, -94, -48, 40, 78, -74],42,26,),
    ([0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1],25,21,),
    ([1, 33, 20, 32, 76, 27, 8, 95, 78, 72, 25, 56],9,10,)
        ]
    n_success = 0
    for i, parameters_set in enumerate(param):
        try:
            if f_filled(*parameters_set) == f_gold(*parameters_set):
                print("MINIMUM_LENGTH_SUBARRAY_SUM_GREATER_GIVEN_VALUE," + sys.argv[1] + "," + str(i) + ",SUCCESS")
            else:
                print("MINIMUM_LENGTH_SUBARRAY_SUM_GREATER_GIVEN_VALUE," + sys.argv[1] + "," + str(i) + ",FAILURE")
        except:
            print("MINIMUM_LENGTH_SUBARRAY_SUM_GREATER_GIVEN_VALUE," + sys.argv[1] + "," + str(i) + ",EXCEPTION")
