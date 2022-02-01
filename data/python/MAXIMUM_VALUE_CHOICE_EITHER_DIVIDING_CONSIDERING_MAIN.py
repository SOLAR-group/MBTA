if __name__ == '__main__':
    param = [
    (3,),
    (19,),
    (39,),
    (89,),
    (96,),
    (68,),
    (48,),
    (5,),
    (3,),
    (4,)
        ]
    n_success = 0
    for i, parameters_set in enumerate(param):
        try:
            if f_filled(*parameters_set) == f_gold(*parameters_set):
                print("MAXIMUM_VALUE_CHOICE_EITHER_DIVIDING_CONSIDERING," + sys.argv[1] + "," + str(i) + ",SUCCESS")
            else:
                print("MAXIMUM_VALUE_CHOICE_EITHER_DIVIDING_CONSIDERING," + sys.argv[1] + "," + str(i) + ",FAILURE")
        except:
            print("MAXIMUM_VALUE_CHOICE_EITHER_DIVIDING_CONSIDERING," + sys.argv[1] + "," + str(i) + ",EXCEPTION")
