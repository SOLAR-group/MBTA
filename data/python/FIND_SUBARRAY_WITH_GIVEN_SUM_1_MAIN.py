if __name__ == '__main__':
    param = [
    ([7, 7, 8, 8, 23, 24, 28, 32, 48, 53, 56, 62, 69, 77, 81, 82, 84, 87, 88, 90],16,31,),
    ([-62, -62, -80, -30, -80, 44, -12, -76, 16, -52, -86, 72, 32, -60, -70, -62, -78, -96, -18, 40, -4, -18, -58, 30, -70, 6, 0, -62, -66, 20, 92, -64, 20, -48, 48, -32, 64, 22, 16, 26],39,44,),
    ([0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1],40,7,),
    ([50, 25, 6, 87, 55, 86, 61, 97, 24, 30, 51, 43, 26, 1, 80, 47, 19, 36, 64, 62, 92, 5, 48, 27, 82, 76, 70, 59, 1, 43, 1, 36, 28, 9, 52, 22, 43],29,105,),
    ([-86, -76, -64, -22, -16, -8, 4, 6, 8, 32, 38, 60, 68, 74],7,2,),
    ([0, 0, 0, 0, 1, 1, 0, 1, 0, 1, 1, 1, 0, 1, 1, 1, 1, 1, 1, 1, 1, 1, 0, 0, 1, 0, 1, 1, 0, 1, 0, 0, 0, 1, 0, 1, 0, 1, 1, 0, 0],31,10,),
    ([7, 7, 12, 25, 25, 32, 33, 34, 37, 39, 39, 41, 46, 48, 56, 56, 57, 58, 61, 62, 62, 63, 65, 66, 69, 72, 74, 78, 78, 79, 80, 85, 89, 94, 95, 99],22,39,),
    ([98, -60],1,98,),
    ([0, 0, 0, 0, 1, 1, 1, 1, 1, 1],8,0,),
    ([80, 89, 83, 42, 75, 30, 64, 25, 95, 17, 90, 6, 11, 1, 77, 16, 75, 86, 96, 67, 27, 80, 27],16,108,)
        ]
    n_success = 0
    for i, parameters_set in enumerate(param):
        try:
            if f_filled(*parameters_set) == f_gold(*parameters_set):
                print("FIND_SUBARRAY_WITH_GIVEN_SUM_1," + sys.argv[1] + "," + str(i) + ",SUCCESS")
            else:
                print("FIND_SUBARRAY_WITH_GIVEN_SUM_1," + sys.argv[1] + "," + str(i) + ",FAILURE")
        except:
            print("FIND_SUBARRAY_WITH_GIVEN_SUM_1," + sys.argv[1] + "," + str(i) + ",EXCEPTION")
