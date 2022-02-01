if __name__ == '__main__':
    param = [
    (37,),
    (82,),
    (87,),
    (80,),
    (92,),
    (58,),
    (98,),
    (53,),
    (11,),
    (58,)
        ]
    n_success = 0
    for i, parameters_set in enumerate(param):
        try:
            if f_filled(*parameters_set) == f_gold(*parameters_set):
                print("COUNT_NUMBER_OF_WAYS_TO_COVER_A_DISTANCE_1," + sys.argv[1] + "," + str(i) + ",SUCCESS")
            else:
                print("COUNT_NUMBER_OF_WAYS_TO_COVER_A_DISTANCE_1," + sys.argv[1] + "," + str(i) + ",FAILURE")
        except:
            print("COUNT_NUMBER_OF_WAYS_TO_COVER_A_DISTANCE_1," + sys.argv[1] + "," + str(i) + ",EXCEPTION")
