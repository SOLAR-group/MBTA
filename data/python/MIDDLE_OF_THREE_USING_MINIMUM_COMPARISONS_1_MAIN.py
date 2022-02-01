if __name__ == '__main__':
    param = [
    (43,24,7,),
    (76,54,66,),
    (57,5,40,),
    (10,13,4,),
    (59,47,56,),
    (92,14,50,),
    (49,62,65,),
    (16,95,12,),
    (33,41,90,),
    (66,63,46,)
        ]
    n_success = 0
    for i, parameters_set in enumerate(param):
        try:
            if f_filled(*parameters_set) == f_gold(*parameters_set):
                print("MIDDLE_OF_THREE_USING_MINIMUM_COMPARISONS_1," + sys.argv[1] + "," + str(i) + ",SUCCESS")
            else:
                print("MIDDLE_OF_THREE_USING_MINIMUM_COMPARISONS_1," + sys.argv[1] + "," + str(i) + ",FAILURE")
        except:
            print("MIDDLE_OF_THREE_USING_MINIMUM_COMPARISONS_1," + sys.argv[1] + "," + str(i) + ",EXCEPTION")
