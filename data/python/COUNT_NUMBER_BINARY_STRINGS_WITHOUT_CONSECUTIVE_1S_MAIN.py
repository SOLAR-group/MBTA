if __name__ == '__main__':
    param = [
    (86,),
    (75,),
    (14,),
    (5,),
    (41,),
    (35,),
    (30,),
    (89,),
    (84,),
    (53,)
        ]
    n_success = 0
    for i, parameters_set in enumerate(param):
        try:
            if f_filled(*parameters_set) == f_gold(*parameters_set):
                print("COUNT_NUMBER_BINARY_STRINGS_WITHOUT_CONSECUTIVE_1S," + sys.argv[1] + "," + str(i) + ",SUCCESS")
            else:
                print("COUNT_NUMBER_BINARY_STRINGS_WITHOUT_CONSECUTIVE_1S," + sys.argv[1] + "," + str(i) + ",FAILURE")
        except:
            print("COUNT_NUMBER_BINARY_STRINGS_WITHOUT_CONSECUTIVE_1S," + sys.argv[1] + "," + str(i) + ",EXCEPTION")
