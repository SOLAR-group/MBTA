if __name__ == '__main__':
    param = [
    ([4, 7, 8, 14, 25, 25, 25, 30, 31, 36, 36, 37, 42, 44, 45, 45, 47, 50, 50, 54, 60, 60, 61, 67, 68, 69, 79, 80, 82, 96],27,),
    ([-6, -2, -94],1,),
    ([0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1],27,),
    ([76, 39, 64, 57, 63, 7, 86, 72, 87, 23, 76, 6, 58, 14, 28, 5, 68, 56, 25, 27, 60, 4, 29, 91, 7, 32, 20, 64, 43, 30],26,),
    ([-98, -80, -64, -60, -58, -54, -46, -44, -38, -30, -26, -20, -14, -14, -12, -8, -8, 16, 18, 18, 24, 26, 26, 34, 46, 70, 76, 82, 98],27,),
    ([0, 0, 1, 0, 0, 1, 0, 1, 0, 0, 1, 1],10,),
    ([3, 4, 4, 5, 7, 13, 21, 21, 21, 22, 24, 25, 25, 34, 34, 40, 40, 45, 48, 50, 51, 60, 61, 64, 68, 73, 74, 77, 79, 80, 85, 90, 91, 93],17,),
    ([46, -22, -48, -64, 44, -70, -8, -56, -24, -8, -92, -58, 60, -8, 78, -54, -66, 92, 32, -98, 46, 80, -2, -30, 20, -88, -18, 46, 68, -2, -48, -32, 48, 88, -92, 96, -82, 38, -82, -50, -20, 34, -50, 2, -64, 18, 50],45,),
    ([0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1],21,),
    ([73, 53, 18, 19, 63],3,)
        ]
    filled_function_param = [
    ([4, 7, 8, 14, 25, 25, 25, 30, 31, 36, 36, 37, 42, 44, 45, 45, 47, 50, 50, 54, 60, 60, 61, 67, 68, 69, 79, 80, 82, 96],27,),
    ([-6, -2, -94],1,),
    ([0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1],27,),
    ([76, 39, 64, 57, 63, 7, 86, 72, 87, 23, 76, 6, 58, 14, 28, 5, 68, 56, 25, 27, 60, 4, 29, 91, 7, 32, 20, 64, 43, 30],26,),
    ([-98, -80, -64, -60, -58, -54, -46, -44, -38, -30, -26, -20, -14, -14, -12, -8, -8, 16, 18, 18, 24, 26, 26, 34, 46, 70, 76, 82, 98],27,),
    ([0, 0, 1, 0, 0, 1, 0, 1, 0, 0, 1, 1],10,),
    ([3, 4, 4, 5, 7, 13, 21, 21, 21, 22, 24, 25, 25, 34, 34, 40, 40, 45, 48, 50, 51, 60, 61, 64, 68, 73, 74, 77, 79, 80, 85, 90, 91, 93],17,),
    ([46, -22, -48, -64, 44, -70, -8, -56, -24, -8, -92, -58, 60, -8, 78, -54, -66, 92, 32, -98, 46, 80, -2, -30, 20, -88, -18, 46, 68, -2, -48, -32, 48, 88, -92, 96, -82, 38, -82, -50, -20, 34, -50, 2, -64, 18, 50],45,),
    ([0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1],21,),
    ([73, 53, 18, 19, 63],3,)
        ]
    n_success = 0
    for i, parameters_set in enumerate(param):
        try:
            f_filled(*(filled_function_param[i]))
            f_gold(*parameters_set)
            if parameters_set == filled_function_param[i]:
                print("RECURSIVE_INSERTION_SORT," + sys.argv[1] + "," + str(i) + ",SUCCESS")
            else:
                print("RECURSIVE_INSERTION_SORT," + sys.argv[1] + "," + str(i) + ",FAILURE")
        except:
            print("RECURSIVE_INSERTION_SORT," + sys.argv[1] + "," + str(i) + ",EXCEPTION")