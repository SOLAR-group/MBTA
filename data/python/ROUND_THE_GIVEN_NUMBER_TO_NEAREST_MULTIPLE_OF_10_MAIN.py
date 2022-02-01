if __name__ == '__main__':
    param = [
    (31,),
    (78,),
    (19,),
    (36,),
    (77,),
    (94,),
    (86,),
    (16,),
    (95,),
    (2,)
        ]
    n_success = 0
    for i, parameters_set in enumerate(param):
        try:
            if f_filled(*parameters_set) == f_gold(*parameters_set):
                print("ROUND_THE_GIVEN_NUMBER_TO_NEAREST_MULTIPLE_OF_10," + sys.argv[1] + "," + str(i) + ",SUCCESS")
            else:
                print("ROUND_THE_GIVEN_NUMBER_TO_NEAREST_MULTIPLE_OF_10," + sys.argv[1] + "," + str(i) + ",FAILURE")
        except:
            print("ROUND_THE_GIVEN_NUMBER_TO_NEAREST_MULTIPLE_OF_10," + sys.argv[1] + "," + str(i) + ",EXCEPTION")
