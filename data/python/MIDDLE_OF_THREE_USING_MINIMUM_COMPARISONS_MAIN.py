if __name__ == '__main__':
    param = [
    (56,5,82,),
    (56,60,17,),
    (36,56,51,),
    (71,54,6,),
    (3,70,81,),
    (84,57,47,),
    (30,80,85,),
    (82,54,32,),
    (90,70,55,),
    (38,4,5,)
        ]
    n_success = 0
    for i, parameters_set in enumerate(param):
        try:
            if f_filled(*parameters_set) == f_gold(*parameters_set):
                print("MIDDLE_OF_THREE_USING_MINIMUM_COMPARISONS," + sys.argv[1] + "," + str(i) + ",SUCCESS")
            else:
                print("MIDDLE_OF_THREE_USING_MINIMUM_COMPARISONS," + sys.argv[1] + "," + str(i) + ",FAILURE")
        except:
            print("MIDDLE_OF_THREE_USING_MINIMUM_COMPARISONS," + sys.argv[1] + "," + str(i) + ",EXCEPTION")
