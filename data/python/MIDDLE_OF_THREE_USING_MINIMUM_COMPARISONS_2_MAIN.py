if __name__ == '__main__':
    param = [
    (48,46,38,),
    (21,7,16,),
    (71,4,31,),
    (93,34,11,),
    (3,61,32,),
    (58,78,6,),
    (88,41,66,),
    (8,84,38,),
    (17,66,27,),
    (13,3,23,)
        ]
    n_success = 0
    for i, parameters_set in enumerate(param):
        try:
            if f_filled(*parameters_set) == f_gold(*parameters_set):
                print("MIDDLE_OF_THREE_USING_MINIMUM_COMPARISONS_2," + sys.argv[1] + "," + str(i) + ",SUCCESS")
            else:
                print("MIDDLE_OF_THREE_USING_MINIMUM_COMPARISONS_2," + sys.argv[1] + "," + str(i) + ",FAILURE")
        except:
            print("MIDDLE_OF_THREE_USING_MINIMUM_COMPARISONS_2," + sys.argv[1] + "," + str(i) + ",EXCEPTION")